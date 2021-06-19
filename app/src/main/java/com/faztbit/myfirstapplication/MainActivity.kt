package com.faztbit.myfirstapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception
import java.lang.NullPointerException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val abuelo = Persona(null, 20, null, 2000.0)


        abuelo.name ?: xd()
        if (abuelo.name != null) {
            xd()
        }

        abuelo.name ?: xd()
        abuelo.name?.let {
            xd()
            xd2()
            xd3()
        }

    }

    fun xd() = Unit
    fun xd2() = Unit
    fun xd3() = Unit
}