package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page5 : AppCompatActivity() {
    lateinit var btnPrevious5:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        castView5()
        onClick5()

    }
    fun castView5(){
        btnPrevious5=findViewById(R.id.btnPrevious4)

    }
    fun onClick5(){
        btnPrevious5.setOnClickListener{
            var intent= Intent(baseContext,page4::class.java)
            startActivity(intent)
        }




}}