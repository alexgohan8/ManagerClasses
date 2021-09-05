package com.dam2.ttdesc

import android.app.Activity
import android.content.Context
import androidx.preference.PreferenceManager

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

    private val contAct = cont as Activity
    private val pref = contAct.getSharedPreferences(
        prefName, Context.MODE_PRIVATE)

    private val edit = pref.edit()

    fun getString(key:String):String{
        return pref.getString(key,"") ?: ""
    }

    fun setString(key:String,value:String){
        edit.putString(key, value)
        edit.apply()
    }
    fun getStringDefault(key:String):String{
        /*to get settings activity values*/
        val pref = PreferenceManager.getDefaultSharedPreferences(contAct)
        return pref.getString(key,"") ?: ""
    }

    fun getIntDefault(key:String):Int{
        val pref = PreferenceManager.getDefaultSharedPreferences(contAct)
        return (pref.getString(key,"0") ?: "0").toInt()
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
