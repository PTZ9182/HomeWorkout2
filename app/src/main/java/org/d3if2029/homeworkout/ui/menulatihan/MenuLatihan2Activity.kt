
package org.d3if2029.homeworkout.ui.menulatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if2029.homeworkout.databinding.ActivityMenuLatihan2Binding
import org.d3if2029.homeworkout.uicewek.menulatihancewek.ExerciseCewekActivity


class MenuLatihan2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuLatihan2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuLatihan2Binding.inflate(layoutInflater)
        setContentView(binding.root)



        // Assuming the button is inside the layout specified in ActivityMenuLatihanBinding
        binding.buttonSimpanDataForm.setOnClickListener {
            val intent = Intent(this@MenuLatihan2Activity, Exercise5Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
