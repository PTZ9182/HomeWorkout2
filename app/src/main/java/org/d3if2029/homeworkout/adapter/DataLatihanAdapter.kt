package org.d3if2029.homeworkout.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.databinding.ItemLatihanBinding
import org.d3if2029.homeworkout.entity.DataLatihan

class DataLatihanAdapter(
    private val exercises: MutableList<DataLatihan>
) : RecyclerView.Adapter<DataLatihanAdapter.ExerciseVH>() {

    private var listener: ((DataLatihan) -> Unit)? = null
    private lateinit var binding: ItemLatihanBinding

    fun showData(exercises: List<DataLatihan>){
        this.exercises.clear()
        this.exercises.addAll(exercises)
        notifyDataSetChanged()
    }

    fun setOnExerciseListener(listener: ((DataLatihan) -> Unit)) {
        this.listener = listener
    }

    inner class ExerciseVH(itemView: ItemLatihanBinding) : RecyclerView.ViewHolder(itemView.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseVH {
        binding = ItemLatihanBinding.inflate(LayoutInflater.from(parent.context), parent,false )
        return ExerciseVH(binding)
    }


    override fun getItemCount(): Int {
        return exercises.size
    }

    override fun onBindViewHolder(holder: ExerciseVH, position: Int) {
        val item = exercises[position]

        holder.itemView.apply {
            binding.apply {
                  namaLatihan.text = item.name
                  kesusahan.text = item.kesusahan
                  tantangan.text = item.tantangan

                Glide.with(mainExerciseImage.context)
                    .load(item.image)
                    .centerInside()
                    .placeholder(R.drawable.logo_aplikasi)
                    .into(mainExerciseImage)
            }
            holder.itemView.setOnClickListener {
                listener?.invoke(exercises[position])
            }
        }

    }

}