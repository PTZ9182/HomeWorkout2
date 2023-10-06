package org.d3if2029.homeworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import org.d3if2029.homeworkout.databinding.ActivityMain2Binding
import org.d3if2029.homeworkout.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private lateinit var navController: NavController
    private lateinit var notificationHelper: NotificationHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        navController= Navigation.findNavController(this,R.id.nav_host_fragment2)
        setupWithNavController(binding.bottomNavigationView,navController)

        notificationHelper = NotificationHelper(this)
        notificationHelper.createNotificationChannel()
        notificationHelper.scheduleNotification()
    }
}