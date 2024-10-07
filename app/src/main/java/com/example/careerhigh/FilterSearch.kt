package com.example.careerhigh

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FilterSearch : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var salaryLayout: LinearLayout
    private lateinit var careerLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter_search)

        radioGroup = findViewById(R.id.radioGroup)
        salaryLayout = findViewById(R.id.salaryLayout)
        careerLayout = findViewById(R.id.careerLayout)

        updateVisibility(View.GONE, View.GONE)

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioProject -> updateVisibility(View.VISIBLE, View.GONE)
                R.id.radioFreelancer -> updateVisibility(View.GONE, View.VISIBLE)
                else -> updateVisibility(View.GONE, View.GONE)
            }
        }
    }

    private fun updateVisibility(salaryVisibility: Int, careerVisibility: Int) {
        salaryLayout.visibility = salaryVisibility
        careerLayout.visibility = careerVisibility
    }

}