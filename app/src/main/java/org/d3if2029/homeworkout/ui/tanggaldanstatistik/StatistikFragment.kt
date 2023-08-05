package org.d3if2029.homeworkout.ui.tanggaldanstatistik

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.adapter.HistoryAdapter
import org.d3if2029.homeworkout.databinding.FragmentStatistikBinding
import org.d3if2029.homeworkout.entity.Sqlite
import org.d3if2029.homeworkout.entity.SqliteOpenHelper

class StatistikFragment : Fragment() {
    private lateinit var binding: FragmentStatistikBinding
    private lateinit var history_rv: RecyclerView
    private lateinit var no_data_tv: TextView
    private lateinit var lineChart: LineChart
    private lateinit var dbHelper: Sqlite


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentStatistikBinding.inflate(inflater, container, false)
        val view = binding.root

        history_rv = view.findViewById(R.id.history_rv1)
        no_data_tv = view.findViewById(R.id.no_data_tv1)

        getAllCompletedDates()

        lineChart = binding.chart
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dbHelper = Sqlite(requireContext(), null)

        val kaloriData = dbHelper.getAllKalori()
        if (kaloriData.isNotEmpty()) {
            val dataPoints = ArrayList<Entry>()

            for ((index, kaloriValue) in kaloriData.withIndex()) {
                val xValue = index.toFloat()
                val yValue = kaloriValue.toFloat()
                dataPoints.add(Entry(xValue, yValue))
            }

            showLineChart(dataPoints)
        }
    }

    private fun showLineChart(dataPoints: List<Entry>) {
        val dataSet = LineDataSet(dataPoints, "Data Kalori")
        dataSet.color = Color.BLUE
        dataSet.setCircleColor(Color.BLUE)
        dataSet.setDrawValues(false)

        val lineDataSets: ArrayList<ILineDataSet> = ArrayList()
        lineDataSets.add(dataSet)

        val lineData = LineData(lineDataSets)

        lineChart.data = lineData
        lineChart.description.isEnabled = false
        lineChart.xAxis.position = XAxis.XAxisPosition.BOTTOM
        lineChart.axisLeft.axisMinimum = 0f
        lineChart.axisRight.isEnabled = false
        lineChart.invalidate()
    }


    private fun getAllCompletedDates() {
        val dbHandler = SqliteOpenHelper(requireContext(), null)
        val allCompletedDatesList = dbHandler.getAllCompletedDatesList()

        if (::no_data_tv.isInitialized && ::history_rv.isInitialized) {
            if (allCompletedDatesList.isEmpty()) {
                no_data_tv.visibility = View.VISIBLE
                history_rv.visibility = View.GONE
            } else {
                no_data_tv.visibility = View.GONE
                history_rv.visibility = View.VISIBLE

                // SET ADAPTER
                history_rv.layoutManager = LinearLayoutManager(requireContext())
                val historyAdapter = HistoryAdapter(requireContext(), allCompletedDatesList)
                history_rv.adapter = historyAdapter
            }
        }
    }
}