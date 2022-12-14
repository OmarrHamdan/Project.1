package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signup:TextView=findViewById(R.id.textView4)
        signup.setOnClickListener(){
            var dialog_var=SignUp()
            dialog_var.show(supportFragmentManager,"Sign Up")

        }
    }
}