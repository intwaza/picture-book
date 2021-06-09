package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RiverActivity : AppCompatActivity() {
    lateinit var btnImage4:Button
    lateinit var  btnBack3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_river)
        castView()
        clickNext()
    }
    fun castView(){
        btnImage4=findViewById(R.id.btnImage4)
        btnBack3=findViewById(R.id.btnBack3)
    }
    fun  clickNext(){
        btnImage4.setOnClickListener {
           var intent=Intent(baseContext,FlowerActivity::class.java)
            startActivity(intent)
        }
        btnBack3.setOnClickListener {
            var intent=Intent(baseContext,LionActivity::class.java)
            startActivity(intent)
        }
    }
}