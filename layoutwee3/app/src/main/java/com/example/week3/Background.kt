package com.example.week3

import android.content.Intent
import android.graphics.Picture
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import kotlinx.android.synthetic.main.activity_background.*

class Background : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background)


    }
    fun btnsave(view: View){
        val intent = Intent(this,MainActivity::class.java);
        startActivity(intent);

        when(test)
        {
            1-> {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("picture", R.drawable.apple)

//                startActivityForResult(intent,);
                finish();}
            2->{
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("picture", R.drawable.cry)
                startActivity(intent);
                finish();
            }
            3->{
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("picture", R.drawable.heart)
                startActivity(intent);
                finish();
            }
            4->{
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("picture", R.drawable.feet)
                startActivity(intent);
                finish();
            }
            5->{
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("picture", R.drawable.glad)
                startActivity(intent);
                finish();
            }
            6->{
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("picture", R.drawable.myhouse)
                startActivity(intent);
                finish();
            }
        }
    }
    var test :Int =0;
    fun img1(view:View ){
        img0.setImageDrawable(
            ContextCompat.getDrawable(applicationContext,R.drawable.apple)
        )
        test=1;
    }
    fun img2(view:View ){
        img0.setImageDrawable(
            ContextCompat.getDrawable(applicationContext,R.drawable.cry)
        )
        test=2;
    }
    fun img3(view:View ){
        img0.setImageDrawable(
            ContextCompat.getDrawable(applicationContext,R.drawable.heart)
        )
        test=3;
    }
    fun img4(view:View ){
        img0.setImageDrawable(
            ContextCompat.getDrawable(applicationContext,R.drawable.feet)
        )
        test=4;
    }
    fun img5(view:View ){
        img0.setImageDrawable(
            ContextCompat.getDrawable(applicationContext,R.drawable.glad)
        )
        test=5;
    }
    fun img6(view:View ){
        img0.setImageDrawable(
            ContextCompat.getDrawable(applicationContext,R.drawable.myhouse)
        )
        test=6;
    }
}
