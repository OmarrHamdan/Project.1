package com.example.project

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signup:TextView=findViewById(R.id.textView4)
        var login:Button=findViewById(R.id.button)
        var user:EditText=findViewById(R.id.editTextTextPersonName)
        var pass:EditText=findViewById(R.id.editTextTextPassword)
        signup.setOnClickListener() {

            var dialog_var = SignUp()
            dialog_var.show(supportFragmentManager, "Sign Up")
        }

//          login.setOnClickListener(){
//
//              if(user.text.toString()==) {
//                  var dialog_var = SignUp()
//                  dialog_var.show(supportFragmentManager, "Sign Up")
//              }
//              else{
//                  Toast.makeText(this, "Username or Password is incorrect", Toast.LENGTH_SHORT).show()
//
//              }
//
//            }

        }
    }
