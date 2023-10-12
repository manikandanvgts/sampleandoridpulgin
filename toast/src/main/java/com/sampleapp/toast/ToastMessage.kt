package com.sampleapp.toast

import android.content.Context
import android.widget.Toast

class ToastMessage {

    fun toast(context:Context,text:String){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}