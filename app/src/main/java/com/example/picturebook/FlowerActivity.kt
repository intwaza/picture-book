package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FlowerActivity : AppCompatActivity() {
    lateinit var btnBack5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flower)
        castViews()
        clickNext()
    }
    fun castViews(){
        btnBack5=findViewById(R.id.btnBack5)
    }
    fun clickNext(){
        btnBack5.setOnClickListener {
            var intent=Intent(baseContext,R.id.btnBack5::class.java)
            startActivity((intent))
        }
    }
}