package com.example.project

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.DialogFragment

class SignUp:DialogFragment(R.layout.signup) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    val done: Button =view.findViewById(R.id.button2)


        done.setOnClickListener(){
            dismiss()
        }
    }
}