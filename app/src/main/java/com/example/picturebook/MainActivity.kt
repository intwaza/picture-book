package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnImage1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        clickNext()
    }
    fun castView(){
        btnImage1=findViewById(R.id.btnImage1)
    }
    fun clickNext(){
        btnImage1.setOnClickListener {
            var intent = Intent(baseContext, TreeActivity::class.java)
            startActivity(intent)
        }
    }
}