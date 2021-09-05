package com.dam2.susdodge

import android.app.Activity
import android.content.Context

class SharePrefManager(cont: Context, prefName:String) {
    //private val prefName = "ttdesc1"

    /*
    * Usage:
    *
    * private lateinit var sharePref:SharePrefManager
    * sharePref = SharePrefManager(this, "name")
    * sharePref.setString("key", "eeeeeee")
    * var aux = sharePref.getString("key")
    *
    * */

    private val contAct = cont
    private val pref = contAct.getSharedPreferences(
        prefName, Context.MODE_PRIVATE)

    private val edit = pref.edit()

    /*
    fun getString(key:String):String{
        return pref.getString(key,"") ?: ""
    }

    fun getStringNull(key:String):String?{
        return pref.getString(key,null)
    }

    fun setString(key:String,value:String){
        edit.putString(key, value)
        edit.apply()
    }

     */


    fun getInt(key:String):Int{
        return pref.getInt(key,0)
    }

    fun getIntDef(key:String,def:Int):Int{
        return pref.getInt(key,def)
    }

    fun setInt(key:String,value:Int){
        edit.putInt(key, value)
        edit.apply()
    }

    fun getFloat(key:String):Float{
        return pref.getFloat(key,0F)
    }

    fun getFloatDef(key:String,def:Float):Float{
        return pref.getFloat(key,def)
    }

    fun setFloat(key:String,value:Float){
        edit.putFloat(key, value)
        edit.apply()
    }

    fun getBoolean(key:String):Boolean{
        return pref.getBoolean(key, false)
    }

    fun setBoolean(key:String,value:Boolean){
        edit.putBoolean(key, value)
        edit.apply()
    }

}