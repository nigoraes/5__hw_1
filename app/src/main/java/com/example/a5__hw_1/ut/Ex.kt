package com.example.a5__hw_1.ut


import android.content.Context
import android.widget.Toast

fun Context.showToast(text:String){
    Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
}