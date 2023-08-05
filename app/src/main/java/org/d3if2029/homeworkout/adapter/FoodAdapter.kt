package org.d3if2029.homeworkout.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_food.view.*
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entity.Food

class FoodAdapter(private val foodList: List<Food>, private val onItemClick: (Food) -> Unit) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.itemView.textViewFoodName.text = food.name
        holder.itemView.imageViewFood.setImageResource(food.imageResourceId)

        holder.itemView.setOnClickListener {
            onItemClick(food)
        }
    }

    override fun getItemCount(): Int = foodList.size

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
