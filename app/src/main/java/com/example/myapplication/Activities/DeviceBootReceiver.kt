package com.example.myapplication.Activities

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast


class DeviceBootReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "android.intent.action.BOOT_COMPLETED") {
            /* Setting the alarm here */
            val alarmIntent = Intent(context, AlarmReciever::class.java)
            val pendingIntent = PendingIntent.getBroadcast(context, 0, alarmIntent, 0)

            val manager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
            //var interval = 1000 * 60 * 20 * 60
            var interval = 1000 * 60 * 2
            manager.setInexactRepeating(
                AlarmManager.RTC_WAKEUP,
                System.currentTimeMillis(),
                interval.toLong(),
                pendingIntent
            )

            Toast.makeText(context, "Alarm Set", Toast.LENGTH_SHORT).show()
        }
    }
}