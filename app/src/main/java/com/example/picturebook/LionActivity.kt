package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LionActivity : AppCompatActivity() {
    lateinit var btnImage3:Button
    lateinit var btnBack2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lion)
        castView()
        clickNext()
    }
    fun castView(){
        btnImage3=findViewById(R.id.btnImage3)
        btnBack2=findViewById(R.id.btnBack2)
    }
    fun clickNext(){
        btnImage3.setOnClickListener {
            var intent=Intent(baseContext,RiverActivity::class.java)
            startActivity(intent)
        }
        btnBack2.setOnClickListener {
            var intent=Intent(baseContext,TreeActivity::class.java)
            startActivity(intent)
        }
    }
}