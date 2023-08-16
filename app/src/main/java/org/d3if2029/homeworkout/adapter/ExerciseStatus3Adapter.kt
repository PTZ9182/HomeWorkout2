package org.d3if2029.homeworkout.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_exercise_status.view.*
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entity.Exercise3Model


class ExerciseStatus3Adapter(val items : ArrayList<Exercise3Model>, val context: Context) : RecyclerView.Adapter<ExerciseStatus3Adapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val tvItem = view.item_tv
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater
            .from(context)
            .inflate(R.layout.item_exercise_status,
                parent,
                false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model : Exercise3Model = items[position]

        holder.tvItem.text = model.getId().toString()

        if(model.getIsSelected()){
            holder.tvItem.background = ContextCompat.getDrawable(context,R.drawable.item_circular_thin_color_border)
            holder.tvItem.setTextColor(Color.parseColor("#212121"))
        }else if(model.getIsCompleted()){
            holder.tvItem.background = ContextCompat.getDrawable(context,R.drawable.circular_color_background)
            holder.tvItem.setTextColor(Color.parseColor("#FFFFFF"))
        }else{
            holder.tvItem.background = ContextCompat.getDrawable(context,R.drawable.item_circular_color_gray_bg)
            holder.tvItem.setTextColor(Color.parseColor("#212121"))
        }
    }

}