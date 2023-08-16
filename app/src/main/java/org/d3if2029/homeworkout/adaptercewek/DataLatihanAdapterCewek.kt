package org.d3if2029.homeworkout.adaptercewek

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.databinding.ItemJenisLatihanBinding
import org.d3if2029.homeworkout.entitycewek.DataLatihanCewek

class DataLatihanAdapterCewek(
    private val exercises: MutableList<DataLatihanCewek>
) : RecyclerView.Adapter<DataLatihanAdapterCewek.ExerciseVH>() {

    private var listener: ((DataLatihanCewek) -> Unit)? = null
    private lateinit var binding: ItemJenisLatihanBinding

    fun showDataCewek(exercises: List<DataLatihanCewek>){
        this.exercises.clear()
        this.exercises.addAll(exercises)
        notifyDataSetChanged()
    }

    fun setOnExerciseListenerCewek(listener: ((DataLatihanCewek) -> Unit)) {
        this.listener = listener
    }

    inner class ExerciseVH(itemView: ItemJenisLatihanBinding) : RecyclerView.ViewHolder(itemView.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseVH {
        binding = ItemJenisLatihanBinding.inflate(LayoutInflater.from(parent.context), parent,false )
        return ExerciseVH(binding)
    }


    override fun getItemCount(): Int {
        return exercises.size
    }

    override fun onBindViewHolder(holder: ExerciseVH, position: Int) {
        val item = exercises[position]

        holder.itemView.apply {
            binding.apply {
                  namaLatihan1.text = item.name
                  kesusahan1.text = item.kesusahan
                  banyakLatihan.text = item.tantangan

                Glide.with(mainExerciseImage2.context)
                    .load(item.image)
                    .centerInside()
                    .placeholder(R.drawable.logo_aplikasi)
                    .into(mainExerciseImage2)
            }
            holder.itemView.setOnClickListener {
                listener?.invoke(exercises[position])
            }
        }

    }

}