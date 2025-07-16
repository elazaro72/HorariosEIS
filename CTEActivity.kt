package com.example.horarioseis

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CTEActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cte)

        val btnConstrucciones = findViewById<Button>(R.id.btnConstrucciones)
        val btnMecanica = findViewById<Button>(R.id.btnMecanica)
        val btnQuimica = findViewById<Button>(R.id.btnQuimica)

        btnConstrucciones.setOnClickListener {
            val intent = Intent(this, EspecialidadActivity::class.java)
            intent.putExtra("especialidad", "Construcciones")
            startActivity(intent)
        }

        btnMecanica.setOnClickListener {
            val intent = Intent(this, EspecialidadActivity::class.java)
            intent.putExtra("especialidad", "Mecánica Eléctrica")
            startActivity(intent)
        }

        btnQuimica.setOnClickListener {
            val intent = Intent(this, EspecialidadActivity::class.java)
            intent.putExtra("especialidad", "Química")
            startActivity(intent)
        }
    }
}
