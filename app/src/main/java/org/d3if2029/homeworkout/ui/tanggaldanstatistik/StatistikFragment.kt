package org.d3if2029.homeworkout.ui.tanggaldanstatistik

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import androidx.navigation.findNavController
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.databinding.FragmentStatistikBinding

class StatistikFragment : Fragment() {
    private lateinit var binding: FragmentStatistikBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {


        binding = FragmentStatistikBinding.inflate(inflater, container, false)
        binding.calendarView
            .setOnDateChangeListener(
                CalendarView.OnDateChangeListener { view, year, month, dayOfMonth ->
                    val Date = (dayOfMonth.toString() + "-"
                            + (month + 1) + "-" + year)

                    binding.idTVDate.setText(Date)
                })
        val entries = listOf(
            Entry(0f, 2f),
            Entry(1f, 4f),
            Entry(2f, 6f),
            Entry(3f, 8f),
            Entry(4f, 10f)
        )

        val dataSet = LineDataSet(entries, "Kalori")
        val lineData = LineData(dataSet)

        binding.lineChart.data = lineData
        binding.lineChart.invalidate()
        binding.lineChart.setOnClickListener {
            it.findNavController().navigate(R.id.action_statistikFragment_to_historyActivity)
        }
        return binding.root
    }

}