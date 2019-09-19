package com.example.myapplication.Activities

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.example.myapplication.R
import java.util.*


class SplashScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        launchSplash()

        setAlarm()


    }

    private fun setAlarm() {
        /* Retrieve a PendingIntent that will perform a broadcast */
        val alarmIntent = Intent(this, AlarmReciever::class.java)
        alarmIntent.putExtra("Title","abc")
        alarmIntent.putExtra("Text","abc")
        var pendingIntent = PendingIntent.getBroadcast(this, 0, alarmIntent, 0)

        var manager: AlarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
      //  var interval = 1000 * 60 * 20 * 60
        var interval = 1000 * 60 * 2

        var calendar: Calendar = Calendar.getInstance()
        calendar.setTimeInMillis(System.currentTimeMillis())
        calendar.set(Calendar.HOUR_OF_DAY, 12)
        calendar.set(Calendar.MINUTE, 48)

        manager.setRepeating(
            AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 1000 * 60 , pendingIntent
        )
    }


    private fun launchSplash() {
        val SPLASH_TIMEOUT = 3000
        Handler().postDelayed({
            //     if (Utilities.isUserLoggedIn(this@SplashScreen)) {
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
//            } else {
//                startActivity(Intent(this@SplashScreen, LoginActivity::class.java))
//                finish()
//            }
        }, SPLASH_TIMEOUT.toLong())
    }


}
