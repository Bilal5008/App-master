package com.example.myapplication.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_notification.*

class NotificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        setTitle("9 Factor diet")
        id_sleep.setOnClickListener {
            onSleepClicked()
        }
        id_excercise.setOnClickListener {
            onSleepClicked()
        }
        id_water.setOnClickListener {
            onSleepClicked()
        }
        id_xx.setOnClickListener {
            onSleepClicked()
        }
        id_yy.setOnClickListener {
            onSleepClicked()
        }
        id_meal.setOnClickListener {
            onSleepClicked()
        }
        id_habit.setOnClickListener {
            onSleepClicked()
        }
        id_ketos.setOnClickListener {
            onSleepClicked()
        }


    }

    private fun onSleepClicked() {
        startActivity(Intent(this, SleepNotificationActivity::class.java))
    }
}

