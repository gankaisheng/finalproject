package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class C_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_2)
    }

    fun page1(view: View){
        val intent = Intent(this, C::class.java )
        startActivity(intent)
    }

    fun page3(view: View){
        val intent = Intent(this, C_3::class.java )
        startActivity(intent)
    }
}