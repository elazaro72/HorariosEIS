package com.example.horarioseis

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCTC = findViewById<Button>(R.id.btnCTC)
        val btnCTE = findViewById<Button>(R.id.btnCTE)

        btnCTC.setOnClickListener {
            val intent = Intent(this, CTCActivity::class.java)
            startActivity(intent)
        }

        btnCTE.setOnClickListener {
            val intent = Intent(this, CTEActivity::class.java)
            startActivity(intent)
        }
    }
}
