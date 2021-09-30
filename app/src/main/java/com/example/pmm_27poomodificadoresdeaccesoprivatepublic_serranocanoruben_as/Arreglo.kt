package com.example.pmm_27poomodificadoresdeaccesoprivatepublic_serranocanoruben_as

class Arreglo {
    private val listaEnteros = IntArray(5)

    init {
        rellenar()
    }

    fun rellenar(){
        for (i in listaEnteros.indices){
            listaEnteros[i] = (0..10).random()
        }
    }

    fun mostrarMayor():Int{
        var mayorValor = listaEnteros[0]
        for (e in listaEnteros){
                if (e > mayorValor){
                    mayorValor = e
            }
        }
        return mayorValor
    }

    fun mostrarMenor():Int{
        var menorValor = listaEnteros[0]
        for (e in listaEnteros){
            if (e < menorValor){
                menorValor = e
            }
        }
        return menorValor
    }

    override fun toString(): String {
        return listaEnteros.contentToString()
    }
}