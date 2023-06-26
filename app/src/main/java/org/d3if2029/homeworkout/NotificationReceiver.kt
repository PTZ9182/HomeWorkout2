package org.d3if2029.homeworkout

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotificationReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val notificationHelper = NotificationHelper(context)
        notificationHelper.createNotificationChannel()
        val notification = notificationHelper.createNotificationContent()

        notificationHelper.showNotification(notification)
    }
}