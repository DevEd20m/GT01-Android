package com.faztbit.myfirstapplication

import android.util.Log

class Son(name: String, length: Int) : GrandFather(name, length) {

    override fun eat() {
//        super.eat()
        Log.d("TAG", "El hijo ${name} está comiendo")
    }

}