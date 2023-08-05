package org.d3if2029.homeworkout.ui.menulatihan

import android.app.Dialog
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.adapter.ExerciseStatusAdapter
import org.d3if2029.homeworkout.databinding.ActivityExerciseBinding
import org.d3if2029.homeworkout.databinding.DialogCustomBackConfirmationBinding
import org.d3if2029.homeworkout.db.Exercises
import org.d3if2029.homeworkout.entity.ExerciseModel
import java.lang.Exception
import java.util.*
import kotlin.collections.ArrayList

class ExerciseActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var binding: ActivityExerciseBinding
    private var restTimer: CountDownTimer? = null
    private var restProgress = 0
    private var restTime: Long = 10

    private var exerciseTimer: CountDownTimer? = null
    private var exerciseProgress = 0
    private var exerciseTime: Long = 30

    private var exerciseList: ArrayList<ExerciseModel>? = null
    private var currentExercisePosition = -1

    private var tts: TextToSpeech? = null
    private var player: MediaPlayer? = null

    private var exerciseAdapter: ExerciseStatusAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarExerciseActivity)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.toolbarExerciseActivity.setNavigationOnClickListener {
            customDialogForBackButton()
        }

        tts = TextToSpeech(this, this)

        exerciseList = Exercises.defaultExerciseList()
        setupRestView()
        setupExerciseStatusRecyclerView()
    }

    // Rest
    private fun setRestProgressBar() {
        binding.progressBar.progress = restProgress
        restTimer = object : CountDownTimer(restTime * 1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                restProgress++
                binding.progressBar.progress = restTime.toInt() - restProgress
                binding.timerTv.text = (restTime - restProgress).toString()
            }

            override fun onFinish() {
                currentExercisePosition++
                if (currentExercisePosition < exerciseList?.size ?: 0) {
                    exerciseList!![currentExercisePosition].setIsSelected(true)
                    exerciseAdapter?.notifyDataSetChanged()
                    setupExerciseView()
                } else {
                    finish()
                    val intent = Intent(this@ExerciseActivity, SelesaiLatihanActivity::class.java)
                    startActivity(intent)
                }
            }
        }.start()
    }

    private fun setupRestView() {
        try {
            player = MediaPlayer.create(applicationContext, R.raw.press_start)
            player?.isLooping = false
            player?.start()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        binding.restViewLl.visibility = View.VISIBLE
        binding.exerciseViewLl.visibility = View.GONE

        restTimer?.cancel()
        restProgress = 0

        if (currentExercisePosition + 1 < exerciseList?.size ?: 0) {
            binding.nextExerciseTv.text = exerciseList!![currentExercisePosition + 1].getName()
        }
        setRestProgressBar()
    }

    // Exercise
    private fun setExerciseProgressBar() {
        binding.exerciseProgressBar.progress = exerciseProgress
        exerciseTimer = object : CountDownTimer(exerciseTime * 1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                exerciseProgress++
                binding.exerciseProgressBar.progress = exerciseTime.toInt() - exerciseProgress
                binding.exerciseTimerTv.text = (exerciseTime - exerciseProgress).toString()
            }

            override fun onFinish() {
                if (currentExercisePosition < exerciseList?.size ?: 0 - 1) {
                    exerciseList!![currentExercisePosition].setIsSelected(false)
                    exerciseList!![currentExercisePosition].setIsCompleted(true)
                    exerciseAdapter?.notifyDataSetChanged()
                    setupRestView()
                } else {
                    finish()
                    val intent = Intent(this@ExerciseActivity, SelesaiLatihanActivity::class.java)
                    startActivity(intent)
                }
            }
        }.start()
    }

    private fun setupExerciseView() {
        binding.exerciseViewLl.visibility = View.VISIBLE
        binding.restViewLl.visibility = View.GONE

        exerciseTimer?.cancel()
        exerciseProgress = 0
        setExerciseProgressBar()

        speakOut(exerciseList!![currentExercisePosition].getName())

        binding.imageIv.setImageResource(exerciseList!![currentExercisePosition].getImage())
        binding.exerciseNameTv.text = exerciseList!![currentExercisePosition].getName()
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = tts?.setLanguage(Locale.US)
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "The language specified is not supported!")
            }
        } else {
            Log.e("TTS", "Initialization Failed!")
        }
    }

    private fun speakOut(text: String) {
        tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, "")
    }

    private fun setupExerciseStatusRecyclerView() {
        binding.exerciseStatusRv.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL, false)

        exerciseAdapter = ExerciseStatusAdapter(exerciseList!!, this)
        binding.exerciseStatusRv.adapter = exerciseAdapter
    }

    override fun onDestroy() {
        // Rest view
        restTimer?.cancel()
        restProgress = 0

        // Exercise view
        exerciseTimer?.cancel()
        exerciseProgress = 0

        // Text to speech
        tts?.stop()
        tts?.shutdown()

        // Media player
        player?.stop()
        player?.release()

        super.onDestroy()
    }

    override fun onBackPressed() {
        customDialogForBackButton()
    }

    private fun customDialogForBackButton() {
        val customDialog = Dialog(this)
        val dialogBinding = DialogCustomBackConfirmationBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)

        dialogBinding.yesBtn.setOnClickListener {
            finish()
            customDialog.dismiss()
        }

        dialogBinding.noBtn.setOnClickListener {
            customDialog.dismiss()
        }

        customDialog.show()
    }
}