package com.example.myapplication.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_meal.*
import android.widget.ArrayAdapter


class MealActivity : AppCompatActivity() {
    var mealPlan: String? = null
    var dietno: String? = null
    var categories = arrayOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal)
        mealPlan = intent.getStringExtra("MealPlan")
        dietno = intent.getStringExtra("Dietno")

        if (mealPlan.toString().toInt() == 1 && dietno.toString().toInt() == 1) {
            categories = getResources().getStringArray(R.array.meal_1_1)

            val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, android.R.id.text1, categories)

            list.setAdapter(adapter)


        }
        if (mealPlan.toString().toInt() == 2 && dietno.toString().toInt() == 1) {
            categories = getResources().getStringArray(R.array.meal_1_2)

            val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, android.R.id.text1, categories)

            list.setAdapter(adapter)


        }


    }
}
