package com.example.pmm_27poomodificadoresdeaccesoprivatepublic_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResult = findViewById<TextView>(R.id.tvResult10)
        val etNumber0 = findViewById<EditText>(R.id.etNumber10)
        val etNumber1 = findViewById<EditText>(R.id.etNumber11)


        val btnSum = findViewById<Button>(R.id.btnSum10)
        btnSum.setOnClickListener {
            val number0 = etNumber0.text.toString().toInt()
            val number1 = etNumber1.text.toString().toInt()
            val operaciones = Operaciones(number0,number1)
            tvResult.text = operaciones.sumar().toString()
        }

        val btnMultiplication = findViewById<Button>(R.id.btnMultiplication10)
        btnMultiplication.setOnClickListener {
            val number0 = etNumber0.text.toString().toInt()
            val number1 = etNumber1.text.toString().toInt()
            val operaciones = Operaciones(number0,number1)
            tvResult.text = operaciones.producto().toString()
        }
    }
}

class Operaciones(var valor0:Int, var valor1:Int) {

    fun sumar():Int{
        return this.valor0+this.valor1
    }

    fun producto():Int{
        return this.valor0*valor1
    }
}