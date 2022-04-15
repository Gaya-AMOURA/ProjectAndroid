package com.example.idirabdelli.activities

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.idirabdelli.R
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDateTime
import java.time.ZoneOffset


class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set calendar to current date
        val current = LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli()
        calendarView.date = current

        Toast.makeText(this, "BIENVENUE", Toast.LENGTH_SHORT).show()

        calendarView.setOnDateChangeListener { view: CalendarView?, year: Int, month: Int, dayofmonth: Int ->
            Toast.makeText(
                this@MainActivity,
                "" + year + "/" + (month + 1) + "/" + dayofmonth, Toast.LENGTH_LONG
            )
                .show()

            val intent = Intent(this, AddEventActivity::class.java)
            intent.putExtra("date", dayofmonth)
            startActivity(intent)

        }

//        calendarView.setOnDateChangeListener()
//
//        calendarView.setOnDateChangeListener( view: CalendarView?, year: Int, month: Int,
//        dayOfMonth: Int) {
//            val intent = Intent(this@MainActivity, AddEventActivity::class.java)
//            startActivity(intent)
//        }
    }

}