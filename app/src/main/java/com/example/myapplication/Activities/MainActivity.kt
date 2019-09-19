package com.example.myapplication.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.Toast
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("General Screen")

        id_selectdiet.setOnClickListener { onSelectDietClicked() }
        id_notification.setOnClickListener { onNotificatioinClicked() }

    }

    fun onSelectDietClicked() {
        if (formValidate()) {
            var intent = Intent(this, DietActivity::class.java)
            intent.putExtra("Dietno", id_dietno.text.toString())

            this.let { ContextCompat.startActivity(it, intent, null) }


        }
    }

    fun onNotificatioinClicked() {

        startActivity(Intent(this, NotificationActivity::class.java))


    }

    fun formValidate(): Boolean {

        if (id_dietno.text.isEmpty()) {
            Toast.makeText(this, "Date  cannot be empty", Toast.LENGTH_SHORT).show()
            return false
        } else if (id_dietno.text.toString().toInt() < 1) {
            Toast.makeText(this, "Cannot be less the 1", Toast.LENGTH_SHORT).show()
            return false
        } else if (id_dietno.text.toString().toInt() > 7) {
            Toast.makeText(this, "Choose greater  then 7", Toast.LENGTH_SHORT).show()
            return false
        } else {
            return true
        }


    }
}
