package com.example.horarioseis

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EspecialidadActivity : AppCompatActivity() {
    private val horariosConstrucciones = mapOf(
        "4CA" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRfF7ZXXcUneJF6sPimMXfZy8djPTngm6iCHtR9fYqbku-Kied-r0AY1rRfMEuuSElrVwcRqeJA_rC2/pubhtml?gid=172680559&single=true",
        "4CB" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRfF7ZXXcUneJF6sPimMXfZy8djPTngm6iCHtR9fYqbku-Kied-r0AY1rRfMEuuSElrVwcRqeJA_rC2/pubhtml?gid=842674769&single=true",
        "4CC" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRfF7ZXXcUneJF6sPimMXfZy8djPTngm6iCHtR9fYqbku-Kied-r0AY1rRfMEuuSElrVwcRqeJA_rC2/pubhtml?gid=1833128398&single=true",
        "5CA" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRfF7ZXXcUneJF6sPimMXfZy8djPTngm6iCHtR9fYqbku-Kied-r0AY1rRfMEuuSElrVwcRqeJA_rC2/pubhtml?gid=906290416&single=true",
        "5CB" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRfF7ZXXcUneJF6sPimMXfZy8djPTngm6iCHtR9fYqbku-Kied-r0AY1rRfMEuuSElrVwcRqeJA_rC2/pubhtml?gid=921924015&single=true",
        "5CC" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRfF7ZXXcUneJF6sPimMXfZy8djPTngm6iCHtR9fYqbku-Kied-r0AY1rRfMEuuSElrVwcRqeJA_rC2/pubhtml?gid=914900886&single=true",
        "6CA" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRfF7ZXXcUneJF6sPimMXfZy8djPTngm6iCHtR9fYqbku-Kied-r0AY1rRfMEuuSElrVwcRqeJA_rC2/pubhtml?gid=298509526&single=true",
        "6CB" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRfF7ZXXcUneJF6sPimMXfZy8djPTngm6iCHtR9fYqbku-Kied-r0AY1rRfMEuuSElrVwcRqeJA_rC2/pubhtml?gid=542617296&single=true",
        "6CC" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRfF7ZXXcUneJF6sPimMXfZy8djPTngm6iCHtR9fYqbku-Kied-r0AY1rRfMEuuSElrVwcRqeJA_rC2/pubhtml?gid=6179730&single=true"
    )

    private val horariosMecanica = mapOf(
        "4MA" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vSHkJ7600Y8Ak7SPYZxXKopbWHK7ipIhbrO_GC43hIQZHylPu28qdCsmRcB6UUmcSjYp9-5z430yFf8/pubhtml?gid=773512134&single=true",
        "4MB" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vSHkJ7600Y8Ak7SPYZxXKopbWHK7ipIhbrO_GC43hIQZHylPu28qdCsmRcB6UUmcSjYp9-5z430yFf8/pubhtml?gid=2114269979&single=true",
        "4MC" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vSHkJ7600Y8Ak7SPYZxXKopbWHK7ipIhbrO_GC43hIQZHylPu28qdCsmRcB6UUmcSjYp9-5z430yFf8/pubhtml?gid=1047637931&single=true",
        "5MA" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vSHkJ7600Y8Ak7SPYZxXKopbWHK7ipIhbrO_GC43hIQZHylPu28qdCsmRcB6UUmcSjYp9-5z430yFf8/pubhtml?gid=542895031&single=true",
        "5MB" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vSHkJ7600Y8Ak7SPYZxXKopbWHK7ipIhbrO_GC43hIQZHylPu28qdCsmRcB6UUmcSjYp9-5z430yFf8/pubhtml?gid=2113901477&single=true",
        "5MC" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vSHkJ7600Y8Ak7SPYZxXKopbWHK7ipIhbrO_GC43hIQZHylPu28qdCsmRcB6UUmcSjYp9-5z430yFf8/pubhtml?gid=1358657777&single=true",
        "6MA" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vSHkJ7600Y8Ak7SPYZxXKopbWHK7ipIhbrO_GC43hIQZHylPu28qdCsmRcB6UUmcSjYp9-5z430yFf8/pubhtml?gid=1153859773&single=true",
        "6MB" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vSHkJ7600Y8Ak7SPYZxXKopbWHK7ipIhbrO_GC43hIQZHylPu28qdCsmRcB6UUmcSjYp9-5z430yFf8/pubhtml?gid=542617296&single=true",
        "6MC" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vSHkJ7600Y8Ak7SPYZxXKopbWHK7ipIhbrO_GC43hIQZHylPu28qdCsmRcB6UUmcSjYp9-5z430yFf8/pubhtml?gid=709825247&single=true"
    )

    private val horariosQuimica = mapOf(
        "4QA" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRbnyAu_y9-SVNeMCutll25WwJkleqkMBMxK9_TYnXQ2Is8mSB7Mi6L9hPPc_dhPjR1kz91sOnGhEtu/pubhtml?gid=372347088&single=true",
        "4QB" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRbnyAu_y9-SVNeMCutll25WwJkleqkMBMxK9_TYnXQ2Is8mSB7Mi6L9hPPc_dhPjR1kz91sOnGhEtu/pubhtml?gid=1473660568&single=true",
        "4QC" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRbnyAu_y9-SVNeMCutll25WwJkleqkMBMxK9_TYnXQ2Is8mSB7Mi6L9hPPc_dhPjR1kz91sOnGhEtu/pubhtml?gid=68211075&single=true",
        "5QA" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRbnyAu_y9-SVNeMCutll25WwJkleqkMBMxK9_TYnXQ2Is8mSB7Mi6L9hPPc_dhPjR1kz91sOnGhEtu/pubhtml?gid=1186941757&single=true",
        "5QB" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRbnyAu_y9-SVNeMCutll25WwJkleqkMBMxK9_TYnXQ2Is8mSB7Mi6L9hPPc_dhPjR1kz91sOnGhEtu/pubhtml?gid=1914734601&single=true",
        "5QC" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRbnyAu_y9-SVNeMCutll25WwJkleqkMBMxK9_TYnXQ2Is8mSB7Mi6L9hPPc_dhPjR1kz91sOnGhEtu/pubhtml?gid=368620209&single=true",
        "6QA" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRbnyAu_y9-SVNeMCutll25WwJkleqkMBMxK9_TYnXQ2Is8mSB7Mi6L9hPPc_dhPjR1kz91sOnGhEtu/pubhtml?gid=1153859773&single=true",
        "6QB" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRbnyAu_y9-SVNeMCutll25WwJkleqkMBMxK9_TYnXQ2Is8mSB7Mi6L9hPPc_dhPjR1kz91sOnGhEtu/pubhtml?gid=542617296&single=true",
        "6QC" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRbnyAu_y9-SVNeMCutll25WwJkleqkMBMxK9_TYnXQ2Is8mSB7Mi6L9hPPc_dhPjR1kz91sOnGhEtu/pubhtml?gid=709825247&single=true"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_especialidad)

        val especialidad = intent.getStringExtra("especialidad") ?: return
        val tvTitulo = findViewById<TextView>(R.id.tvTitulo)
        tvTitulo.text = "Horarios CTE - $especialidad"

        val horarios = when (especialidad) {
            "Construcciones" -> horariosConstrucciones
            "Mecánica Eléctrica" -> horariosMecanica
            "Química" -> horariosQuimica
            else -> return
        }

        // Configurar botones para cada curso
        for ((curso, url) in horarios) {
            val buttonId = resources.getIdentifier("btn$curso", "id", packageName)
            val button = findViewById<Button>(buttonId)
            button?.setOnClickListener {
                abrirHorario(url)
            }
        }
    }

    private fun abrirHorario(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    fun volverInicio(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
