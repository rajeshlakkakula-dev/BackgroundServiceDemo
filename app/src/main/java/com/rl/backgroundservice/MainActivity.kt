package com.rl.backgroundservice

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
  lateinit  var startService: Button
   lateinit var stopService: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startService = findViewById(R.id.startButton)
        stopService = findViewById(R.id.stopButton)
        startService.setOnClickListener(this)
        stopService.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view === startService) {
            startService(Intent(this, MyService::class.java))
        } else if (view === stopService) {
            stopService(Intent(this, MyService::class.java))
        }
    }
}