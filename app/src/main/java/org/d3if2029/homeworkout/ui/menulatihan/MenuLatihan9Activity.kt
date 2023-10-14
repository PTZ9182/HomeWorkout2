
package org.d3if2029.homeworkout.ui.menulatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if2029.homeworkout.databinding.ActivityMenuLatihan9Binding


class MenuLatihan9Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuLatihan9Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuLatihan9Binding.inflate(layoutInflater)
        setContentView(binding.root)



        // Assuming the button is inside the layout specified in ActivityMenuLatihanBinding
        binding.buttonSimpanDataForm.setOnClickListener {
            val intent = Intent(this@MenuLatihan9Activity, Exercise7Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
