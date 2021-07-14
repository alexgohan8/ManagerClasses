package com.dam2.ttdesc

import java.util.Calendar

class DateTimeManager {
    private val timeSeparator = ":"
    private val dateTimeSeparator = ""
    var dateSeparator = ""
    var dateOrder = 0

    private fun intToString(num:Int):String{
        return if(num<10){
            "0$num"
        }else{
            num.toString()
        }
    }

    private fun formatTime(h:Int, m:Int):String{
        val hh = intToString(h)
        val mm = intToString(m)
        return "$hh$timeSeparator$mm"
    }

    fun formatTime(calendar: Calendar):String{
        val h = calendar.get(Calendar.MINUTE)
        val m = calendar.get(Calendar.HOUR_OF_DAY)
        return formatTime(h,m)
    }

    private fun formatDate(year:Int, month:Int, day:Int):String{
        val sep = dateSeparator
        val monthAux = intToString(month)
        val dayAux = intToString(day)
        return when (dateOrder){
            0 -> {
                "$year$sep$monthAux$sep$dayAux"
            }
            1 -> {
                "$dayAux$sep$monthAux$sep$year"
            }
            else -> {
                "$year$sep$monthAux$sep$dayAux"
            }
        }
    }

    fun formatDate(calendar: Calendar):String{
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)+1
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        return formatDate(year,month,day)
    }

    fun formatDateTime(calendar: Calendar):String{
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)+1
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val h = calendar.get(Calendar.MINUTE)
        val m = calendar.get(Calendar.HOUR_OF_DAY)

        val date = formatDate(year,month,day)
        val time = formatTime(h,m)

        return "$date$dateTimeSeparator$time"
    }

}