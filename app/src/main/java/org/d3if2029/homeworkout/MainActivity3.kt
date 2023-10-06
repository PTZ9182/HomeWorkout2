package org.d3if2029.homeworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import org.d3if2029.homeworkout.databinding.ActivityMain2Binding
import org.d3if2029.homeworkout.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    private lateinit var navController: NavController
    private lateinit var notificationHelper: NotificationHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        navController= Navigation.findNavController(this,R.id.nav_host_fragment3)
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController)

        notificationHelper = NotificationHelper(this)
        notificationHelper.createNotificationChannel()
        notificationHelper.scheduleNotification()
    }
}