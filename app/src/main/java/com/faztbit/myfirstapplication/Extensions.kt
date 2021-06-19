package com.faztbit.myfirstapplication

import android.content.Intent
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


fun String.printValue() {
    Log.d("TAG", this)
}

fun AppCompatActivity.gonnaToNextActivity(nextClass: Class<*>) {
    startActivity(Intent(this, nextClass::class.java))
}

fun executeProcess(lambda: FunctionLambda) {
    lambda.print()
}