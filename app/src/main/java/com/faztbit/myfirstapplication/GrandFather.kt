package com.faztbit.myfirstapplication

import android.util.Log

open class GrandFather(val name: String, val length: Int) {
    open fun eat() {
        Log.d("TAG", "El abuelo ${name} está comiendo")
    }

     fun playSoccer() {
        Log.d("Tag", "Estoy jugando futbol  y mi nombre es${name}a nivel profesional")
    }
}