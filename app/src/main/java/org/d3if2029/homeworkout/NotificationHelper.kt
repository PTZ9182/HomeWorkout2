package org.d3if2029.homeworkout

import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import java.util.*

class NotificationHelper(private val context: Context) {
    private val CHANNEL_ID = "DailyReminder"
    private val NOTIFICATION_ID = 0
    private val REMOTE_INPUT_KEY = "remote_input_key"

    fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelName = "Daily Reminder"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, channelName, importance)
            channel.enableLights(true)
            channel.lightColor = Color.GREEN
            channel.enableVibration(true)

            val notificationManager = context.getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(channel)
        }
    }

    @RequiresApi(Build.VERSION_CODES.S)
    fun createNotificationIntent(): PendingIntent {
        val intent = Intent(context, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

        return PendingIntent.getActivity(
            context,
            NOTIFICATION_ID,
            intent,
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )
    }

    fun scheduleNotification() {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.HOUR_OF_DAY, 8) // Set jam pengingat (contoh: pukul 8 pagi)
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)

        val intent = Intent(context, NotificationReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(
            context,
            0,
            intent,
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )

        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        alarmManager.setRepeating(
            AlarmManager.RTC_WAKEUP,
            calendar.timeInMillis,
            AlarmManager.INTERVAL_DAY,
            pendingIntent
        )
    }

    @RequiresApi(Build.VERSION_CODES.R)
    fun createNotificationContent(): Notification {
        val replyLabel = "Reply"
        val remoteInput = RemoteInput.Builder(REMOTE_INPUT_KEY)
            .setLabel(replyLabel)
            .build()



        return NotificationCompat.Builder(context, CHANNEL_ID)
            .setContentTitle("Daily Reminder")
            .setContentText("Waktunya melakukan tugas harian!")
            .setSmallIcon(R.drawable.ic_notifications)
            .setContentIntent(createNotificationIntent())
            .setAutoCancel(true)
            .build()
    }

    fun showNotification(notification: Notification) {
        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(NOTIFICATION_ID, notification)
    }
}