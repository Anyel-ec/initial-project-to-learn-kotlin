package com.anyel.myfirstproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.anyel.myfirstproject.firstaApp.FirstAppActivity
import com.anyel.myfirstproject.icmcalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnFirstApp = findViewById<AppCompatButton>(R.id.btnFirstApp)
        val btnICM = findViewById<AppCompatButton>(R.id.btnICM)
        // saludar app
        btnFirstApp.setOnClickListener {
            // ir a la primera app
            navigateToSaludarApp()
        }
        btnICM.setOnClickListener {  navegateToICM() }
    }

    private fun navegateToICM() {
    val intent = Intent(this, ImcCalculatorActivity::class.java)
       startActivity(intent)

    }

    private fun navigateToSaludarApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}
