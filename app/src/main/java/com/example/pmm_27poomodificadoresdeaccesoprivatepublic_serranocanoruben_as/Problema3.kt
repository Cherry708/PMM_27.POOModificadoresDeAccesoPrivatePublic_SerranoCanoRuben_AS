package com.example.pmm_27poomodificadoresdeaccesoprivatepublic_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Problema3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3)

        val tvResult = findViewById<TextView>(R.id.tvResult30)

        val btnEnter = findViewById<Button>(R.id.btnEnter30)
        btnEnter.setOnClickListener {
            val arreglo = Arreglo()
            val message = "Menor: ${arreglo.mostrarMenor()}, mayor: ${arreglo.mostrarMayor()}, " +
                    "Lista: $arreglo"
            tvResult.text = message
        }
    }
}

