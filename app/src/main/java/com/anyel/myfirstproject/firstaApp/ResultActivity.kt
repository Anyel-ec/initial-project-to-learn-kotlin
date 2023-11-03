package com.anyel.myfirstproject.firstaApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.anyel.myfirstproject.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val txtV = findViewById<TextView>(R.id.txtV)
        intent.extras?.let {
            val name = it.getString("name")
            txtV.text = name
        }
    }
}