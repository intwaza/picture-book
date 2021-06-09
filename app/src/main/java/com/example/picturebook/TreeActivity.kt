package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TreeActivity : AppCompatActivity() {
    lateinit var btnImage2:Button
    lateinit var btnBack1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tree)
        castView()
        clickNext()
    }
    fun castView(){
        btnImage2=findViewById(R.id.btnImage2)
        btnBack1=findViewById(R.id.btnBack1)
    }
    fun clickNext(){
        btnImage2.setOnClickListener {
            var intent= Intent(baseContext,LionActivity::class.java)
            startActivity(intent)
        }
        btnBack1.setOnClickListener {
            var intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}