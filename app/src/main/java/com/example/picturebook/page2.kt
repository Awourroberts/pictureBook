package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page2 : AppCompatActivity() {
    lateinit var btnPrevious: Button
    lateinit var btnnext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        castView1()
        onClick1()
    }
    fun castView1(){
        btnPrevious=findViewById(R.id.btnPrevious)
        btnnext2=findViewById(R.id.btnNext)

    }
    fun onClick1() {
        btnPrevious.setOnClickListener {
            var intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
        btnnext2.setOnClickListener {
            var intent = Intent(baseContext, page3::class.java)
            startActivity(intent)
        }   }
    }





