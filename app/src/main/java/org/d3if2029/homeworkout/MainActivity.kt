package org.d3if2029.homeworkout


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import org.d3if2029.homeworkout.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var notificationHelper: NotificationHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController= Navigation.findNavController(this,R.id.nav_host_fragment)

        notificationHelper = NotificationHelper(this)
        notificationHelper.createNotificationChannel()
        notificationHelper.scheduleNotification()
    }
}