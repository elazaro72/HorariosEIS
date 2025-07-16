package com.example.horarioseis

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class CTCActivity : AppCompatActivity() {
    private val horariosPrimero = mapOf(
        "1A" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=1326503871&single=true",
        "1B" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=1202122739&single=true",
        "1C" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=2099359490&single=true",
        "1D" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=112965849&single=true",
        "1E" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=1244060011&single=true",
        "1F" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=279839377&single=true",
        "1G" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=188181446&single=true"
    )

    private val horariosSegundo = mapOf(
        "2A" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=354041862&single=true",
        "2B" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=890063747&single=true",
        "2C" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=2082243339&single=true",
        "2D" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=329677947&single=true",
        "2E" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=1948361461&single=true",
        "2F" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=1150601194&single=true",
        "2G" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=528821636&single=true"
    )

    private val horariosTercero = mapOf(
        "3A" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=883598872&single=true",
        "3B" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=1203715288&single=true",
        "3C" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=220833076&single=true",
        "3D" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=2070917274&single=true",
        "3E" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=1490666399&single=true",
        "3F" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=820335930&single=true",
        "3G" to "https://docs.google.com/spreadsheets/d/e/2PACX-1vRECQPEWT0e-TOfA6fWpkPxJMOH3YMb0uL9Sfb4qWBUUCui1nxjDlHRUZ9gaPcFLr_Pl6b0kRmRpqIj/pubhtml?gid=1107992359&single=true"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ctc)

        val spinnerPrimero = findViewById<Spinner>(R.id.spinnerPrimero)
        val spinnerSegundo = findViewById<Spinner>(R.id.spinnerSegundo)
        val spinnerTercero = findViewById<Spinner>(R.id.spinnerTercero)

        // Configurar spinners
        setupSpinner(spinnerPrimero, horariosPrimero)
        setupSpinner(spinnerSegundo, horariosSegundo)
        setupSpinner(spinnerTercero, horariosTercero)
    }

    private fun setupSpinner(spinner: Spinner, horarios: Map<String, String>) {
        val cursos = horarios.keys.toList()
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, cursos)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val curso = parent.getItemAtPosition(position).toString()
                val url = horarios[curso] ?: return
                abrirHorario(url)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {}
        }
    }

    private fun abrirHorario(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
