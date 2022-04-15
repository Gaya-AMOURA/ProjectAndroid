package com.example.idirabdelli.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.idirabdelli.R
import kotlinx.android.synthetic.main.calendar_day.*

class AddEventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar_day)
        if(intent != null){
           var str = intent.getStringExtra("date").toString()
            exThreeDayText.setText("date")
        }

    }
}