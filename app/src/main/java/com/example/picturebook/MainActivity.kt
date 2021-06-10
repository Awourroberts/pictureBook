package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        onClick()

    }
     fun castView(){
        btnNext=findViewById(R.id.btnNext)


    }
    fun onClick(){
        btnNext.setOnClickListener{
            var intent=Intent(baseContext,page2::class.java)
            startActivity(intent)
        }

    }
}