package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page4 : AppCompatActivity() {
    lateinit var btnPrevious4: Button
    lateinit var btnext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        castView4()
        onClick4()
    }
    fun castView4(){
        btnPrevious4=findViewById(R.id.btnPrevious3)
        btnext4=findViewById(R.id.btnnext4)


    }
    fun onClick4() {
        btnPrevious4.setOnClickListener {
            var intent = Intent(baseContext, page3::class.java)
            startActivity(intent)

        }
        btnext4.setOnClickListener {
            var intent =Intent(baseContext,page5::class.java)
            startActivity(intent)


        }



    }
    }
