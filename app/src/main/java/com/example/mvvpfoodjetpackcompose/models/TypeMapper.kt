package com.example.mvvpfoodjetpackcompose.models

import androidx.room.TypeConverter
import kotlinx.android.parcel.TypeParceler

class TypeMapper {

    @TypeConverter
    fun fromListToString(list : List<String>) : String? {
        var string : String? = null
           for(s in list){
               string = s
           }
        return string
    }

    @TypeConverter
    fun fromStringToList(value : String) : ArrayList<String>? {
        val list : ArrayList<String> = arrayListOf()
        list.add(value)
        return list
    }
}