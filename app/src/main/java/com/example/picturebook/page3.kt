package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page3 : AppCompatActivity() {
    lateinit var btnPrevious3: Button
    lateinit var btnnext3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        castView3()
        onClick3()


    }

    fun castView3() {
        btnPrevious3= findViewById(R.id.btnPrevious3)

        btnnext3 = findViewById(R.id.btnnext3)


    }

    fun onClick3() {
        btnPrevious3.setOnClickListener() {
            var intent = Intent(baseContext, page2::class.java)
            startActivity(intent)

        }
        btnnext3.setOnClickListener {
            var intent = Intent(baseContext, page4::class.java)
            startActivity(intent)
        }



    }


}






