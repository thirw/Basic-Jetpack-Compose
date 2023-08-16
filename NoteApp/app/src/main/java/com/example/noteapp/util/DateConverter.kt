package com.example.noteapp.util

import androidx.room.TypeConverter
import java.util.*

class DateConverter {
    @TypeConverter
    fun timeStampFromDate(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun dateFromTimesStamp(timeStamp: Long): Date? {
        return Date(timeStamp)
    }
}