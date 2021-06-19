package com.faztbit.myfirstapplication

import android.util.Log

class AnimalTerrestre(override val name: String, override val length: Int) : Animals {


    fun run() {
        Log.d("TAG", "El animal ${name} está corriendo")
    }

    override fun eat() {
        TODO("Not yet implemented")
    }
}