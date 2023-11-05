package com.anyel.myfirstproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.anyel.myfirstproject.firstaApp.FirstAppActivity

class MenuActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnFirstApp = findViewById<AppCompatButton>(R.id.btnFirstApp)
        // saludar app
        btnFirstApp.setOnClickListener {
            // ir a la primera app
            navigateToSaludarApp()
        }
    }

    private fun navigateToSaludarApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}
