package com.example.level2_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Data class called Reminder which has a String representing the reminder **/
    data class Reminder(
        var reminderText: String
    )
    
}