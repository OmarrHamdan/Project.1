package com.example.project

import android.content.ContentValues
import android.database.Cursor
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.DialogFragment



class SignUp:DialogFragment(R.layout.signup) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dialog?.window?.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
    val done: Button =view.findViewById(R.id.button2)
    var Fname:EditText=view.findViewById(R.id.editTextTextPersonName)
        var Lname:EditText=view.findViewById(R.id.editTextTextPersonName4)
        var em:EditText=view.findViewById(R.id.editTextTextEmailAddress)
        var pnum:EditText=view.findViewById(R.id.editTextPhone)
        var user:EditText=view.findViewById(R.id.editTextTextPersonName3)
        var pass:EditText=view.findViewById(R.id.editTextTextPassword)
        var cv=ContentValues()
        var rs= activity?.contentResolver?.query(CProvider.CONTENT_URL, arrayOf(CProvider._ID,CProvider.FIRST_NAME,CProvider.LAST_NAME,CProvider.EMAIL,CProvider.PHONE,CProvider.USERNAME,CProvider.PASSWORD),null,null,null)



        done.setOnClickListener(){
            if(Fname.text.toString()==""|| Lname.text.toString()==""||em.text.toString()==""||user.text.toString()==""||pass.text.toString()==""||pnum.text.toString()=="") {
                Toast.makeText(context, "Please fill in all the fields", Toast.LENGTH_SHORT).show()
            }
            else {
                cv.put(CProvider.FIRST_NAME, Fname.text.toString())
                cv.put(CProvider.LAST_NAME, Lname.text.toString())
                cv.put(CProvider.EMAIL, em.text.toString())
                cv.put(CProvider.PHONE, pnum.text.toString())
                cv.put(CProvider.USERNAME, user.text.toString())
                cv.put(CProvider.PASSWORD, pass.text.toString())
                activity?.contentResolver?.insert(CProvider.CONTENT_URL, cv)
                rs?.requery()
                dismiss()
            }
        }
    }
}