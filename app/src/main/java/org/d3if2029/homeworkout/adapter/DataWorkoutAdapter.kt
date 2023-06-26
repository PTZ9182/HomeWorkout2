package org.d3if2029.homeworkout.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.databinding.ItemJenisLatihanBinding
import org.d3if2029.homeworkout.databinding.ItemLatihanBinding
import org.d3if2029.homeworkout.entity.DataWorkout

class DataWorkoutAdapter(
    private val workouts: MutableList<DataWorkout>
    ): RecyclerView.Adapter<DataWorkoutAdapter.WorkoutVH>(){

    private var listener: ((DataWorkout) -> Unit)? = null
    private lateinit var binding: ItemJenisLatihanBinding

    fun showData(exercises: List<DataWorkout>){
        this.workouts.clear()
        this.workouts.addAll(exercises)
        notifyDataSetChanged()
    }
    fun setOnExerciseListener(listener: ((DataWorkout) -> Unit)) {
        this.listener = listener
    }

    inner class WorkoutVH(itemView: ItemJenisLatihanBinding) : RecyclerView.ViewHolder(itemView.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataWorkoutAdapter.WorkoutVH {
        binding = ItemJenisLatihanBinding.inflate(LayoutInflater.from(parent.context), parent,false )
        return WorkoutVH(binding)
    }

    override fun getItemCount(): Int {
        return workouts.size
    }
    override fun onBindViewHolder(holder: WorkoutVH, position: Int) {
        val item = workouts[position]

        holder.itemView.apply {
            binding.apply {
                namaLatihan1.text = item.nama
                banyakLatihan.text = item.banyak

                Glide.with(mainExerciseImage2.context)
                    .load(item.gambar)
                    .centerInside()
                    .placeholder(R.drawable.logo_aplikasi)
                    .into(mainExerciseImage2)
            }
            holder.itemView.setOnClickListener {
                listener?.invoke(workouts[position])
            }
        }

    }

    }