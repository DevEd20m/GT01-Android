package com.faztbit.myfirstapplication

import android.util.Log

open class AnimalAcuatico(override val name: String, override val length: Int) : Animals {
    override fun eat() {
        Log.d("TAG", "El animal ${name} está comiendo")
    }

    fun swing() {
        Log.d("TAG", "El animal ${name} está nadando")
    }
}
