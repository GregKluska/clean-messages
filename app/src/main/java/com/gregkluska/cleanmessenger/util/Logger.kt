package com.gregkluska.cleanmessenger.util

import android.util.Log
import com.gregkluska.cleanmessenger.util.Constants.DEBUG
import com.gregkluska.cleanmessenger.util.Constants.TAG

var isUnitTest = false

fun printLogD(className: String?, message: String ) {
    if (DEBUG && !isUnitTest) {
        Log.d(TAG, "$className: $message")
    }
    else if(DEBUG && isUnitTest){
        println("$className: $message")
    }
}
