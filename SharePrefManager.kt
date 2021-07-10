package com.dam2.tiktokdesc

import android.content.Context

class SharePrefManager(context: Context) {
    private val prefName = "ttdesc1"

    private val pref = context.getSharedPreferences(
        prefName, Context.MODE_PRIVATE)

    private val edit = pref.edit()


    fun getString(key:String):String{
        return pref.getString(key,"") ?: ""
    }

    fun setString(key:String,value:String){
        edit.putString(key, value)
        edit.apply()
    }
    /*
    fun getInt(key:String):Int{
        return pref.getInt(key,0)
    }

    fun setInt(key:String,value:Int){
        edit.putInt(key, value)
        edit.apply()
    }
    */
}