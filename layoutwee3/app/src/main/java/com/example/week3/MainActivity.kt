package com.example.week3

import android.content.Intent
import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intext2 = findViewById<TextView>(R.id.text2)
        intext2.setText(getIntent().getStringExtra("EdiTtEXTvALUE"));


        val intex3 =findViewById<ImageView>(R.id.view1)
        intex3.setImageResource(intent.getIntExtra("picture",0));

    }
    fun btnbackground(view: View){
        val intent = Intent(this,Background::class.java);
        startActivityForResult(intent,999);
    }
    fun btntitle(view: View){
        val intent = Intent(this,Title_screen::class.java);
        startActivity(intent);
    }
}
