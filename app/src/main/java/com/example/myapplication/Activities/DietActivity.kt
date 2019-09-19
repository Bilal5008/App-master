package com.example.myapplication.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_diet.*
import kotlinx.android.synthetic.main.activity_main.*

class DietActivity : AppCompatActivity() {
    var dietno: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet)
        dietno = intent.getStringExtra("Dietno")
        setTitle("Diet " + dietno)

        id_meal_1.setOnClickListener { onMealPlanFirstClicked() }
        id_meal_2.setOnClickListener { onMealPlanSecondClicked() }
        id_meal_3.setOnClickListener { onMealPlanThirdClicked() }
    }

    private fun onMealPlanThirdClicked() {
        var intent = Intent(this, MealActivity::class.java)
        intent.putExtra("Dietno", dietno)
        intent.putExtra("MealPlan", "3")

        this.let { ContextCompat.startActivity(it, intent, null) }
    }

    private fun onMealPlanSecondClicked() {
        var intent = Intent(this, MealActivity::class.java)
        intent.putExtra("Dietno", dietno)
        intent.putExtra("MealPlan", "2")

        this.let { ContextCompat.startActivity(it, intent, null) }
    }

    private fun onMealPlanFirstClicked() {
        var intent = Intent(this, MealActivity::class.java)
        intent.putExtra("Dietno", dietno)
        intent.putExtra("MealPlan", "1")

        this.let { ContextCompat.startActivity(it, intent, null) }
    }
}
