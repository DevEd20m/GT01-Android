package com.faztbit.myfirstapplication

import android.util.Log

class Persona(
    val name: String?,
    var age: Int,
    val length: Double?,
    private val amountInBank: Double
) {

    fun run() {
        Log.d("TAG", "${name} está corriendo")
    }

    private fun eat() {
        Log.d("TAG", "${name} está comiendo")
    }

    fun jump() {
        Log.d("TAG", "${name} está saltando")
        eat()
    }

    fun getAmountBank(): Double {
        return amountInBank
    }
}