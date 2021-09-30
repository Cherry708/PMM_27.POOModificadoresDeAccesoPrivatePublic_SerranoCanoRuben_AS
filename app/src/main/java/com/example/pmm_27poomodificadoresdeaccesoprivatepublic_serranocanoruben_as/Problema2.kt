package com.example.pmm_27poomodificadoresdeaccesoprivatepublic_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val tvResult = findViewById<TextView>(R.id.tvResult20)
        val btnEnter = findViewById<Button>(R.id.btnEnter20)

        btnEnter.setOnClickListener {
            val dado = Dado()
            dado.tirar()
            val message = dado.espaciador().plus("\n ${dado.mostrarValor()}")
            tvResult.text = message
        }



    }
}

class Dado(){
    var valor = (0..6).random()

    fun tirar(){
        valor = (0..6).random()
    }

    fun mostrarValor():Int{
        return this.valor
    }

    fun espaciador():String{
        return "******"
    }
}