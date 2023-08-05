
package org.d3if2029.homeworkout.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_detail.*
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entity.Food

class FoodDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        val food = intent.getParcelableExtra<Food>("food")

        // Tampilkan detail makanan
        food?.let {
            imageViewFoodDetail.setImageResource(it.imageResourceId)
            textViewFoodNameDetail.text = it.name
            textViewFoodDescription.text = it.description
        }
    }
}