package com.example.project

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.net.Uri

class CProvider:ContentProvider() {

    companion object{
        val PROVIDER_NAME="com.example.project/CProvider"
        val URL="content://$PROVIDER_NAME/Account"
        val CONTENT_URL= Uri.parse(URL)

        val _ID="_id"
        val FIRST_NAME="FIRST_NAME"
        val LAST_NAME="LAST_NAME"
        val EMAIL="EMAIL"
        val PHONE="PHONE"
        val USERNAME="USERNAME"
        val PASSWORD="PASSWORD"
    }
    lateinit var db: SQLiteDatabase



    override fun onCreate(): Boolean {

        var helper=Helper(getContext())
        db=helper.writableDatabase
        return if(db==null) false else true

    }
    override fun insert(uri: Uri, cv: ContentValues?): Uri? {

        db.insert("Account",null,cv)
        context?.contentResolver?.notifyChange(uri,null)
        return uri


    }
    override fun update(uri: Uri, cv: ContentValues?, condition: String?, condition_val: Array<out String>?): Int {

        var count=db.update("Account",cv,condition,condition_val)
        context?.contentResolver?.notifyChange(uri,null)
        return count

    }
    override fun delete(uri: Uri, condition: String?, condition_val: Array<out String>?): Int {

        var count=db.delete("Accouht",condition,condition_val)
        context?.contentResolver?.notifyChange(uri,null)
        return count

    }

    override fun query(
        uri: Uri,
        cols: Array<out String>?,
        condition: String?,
        condition_val: Array<out String>?,
        order: String?
    ): Cursor? {
       return db.query("Account",cols,condition,condition_val,null,null,order)
    }

    override fun getType(p0: Uri): String? {
        return "vnd.android.cursor.dir/vnd.example.Account"

    }







}