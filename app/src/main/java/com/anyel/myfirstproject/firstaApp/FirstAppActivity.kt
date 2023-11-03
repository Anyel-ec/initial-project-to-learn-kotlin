package com.anyel.myfirstproject.firstaApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.anyel.myfirstproject.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnClick = findViewById<AppCompatButton>(R.id.btnClick)
        val etName = findViewById<AppCompatEditText>(R.id.etName) // Cambiado a EditText si etName se refiere a un campo de texto

        btnClick.setOnClickListener {
            val name = etName.text.toString() // Obtener el texto del EditText
            if (name.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("name", name)
                startActivity(intent)
            }
        }

    }
}