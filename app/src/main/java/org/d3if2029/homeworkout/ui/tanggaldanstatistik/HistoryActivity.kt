package org.d3if2029.homeworkout.ui.tanggaldanstatistik

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_history.*
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.adapter.HistoryAdapter
import org.d3if2029.homeworkout.entity.SqliteOpenHelper


class HistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        setSupportActionBar(toolbar_history_activity)
        val actionBar = supportActionBar
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true)//set back button
        }

        // set back button action
        toolbar_history_activity.setNavigationOnClickListener {
            onBackPressed()
        }

        getAllCompletedDates()
    }

    private fun getAllCompletedDates(){
        val dbHandler = SqliteOpenHelper(this,null)
        val allCompletedDatesList = dbHandler.getAllCompletedDatesList()

        if(allCompletedDatesList.isEmpty()){
            history_rv.visibility = View.GONE
            no_data_tv.visibility = View.VISIBLE
        }else{
            history_rv.visibility = View.VISIBLE
            no_data_tv.visibility = View.GONE

            // SET ADAPTER
            history_rv.layoutManager = LinearLayoutManager(this)
            val historyAdapter = HistoryAdapter(this,allCompletedDatesList)
            history_rv.adapter = historyAdapter
        }
    }
}
