package com.example.project

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Helper(context: Context?):SQLiteOpenHelper(context,"Account",null,1){
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE Account(_id INTEGER PRIMARY KEY AUTOINCREMENT,FIRST_NAME TEXT," +
                "LAST_NAME TEXT,EMAIL VARCHAR2,PHONE INTEGER,USERNAME VARCHAR2,PASSWORD VARCHAR2)")

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }

}