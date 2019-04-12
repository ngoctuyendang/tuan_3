package com.example.week3

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_title_screen.*

class Title_screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_screen)
    }
    var value :Int =0;
    fun btnsave(view: View){

        val intent = Intent(this,MainActivity::class.java);
        val intext1 = findViewById<EditText>(R.id.Edit1)

        when(value)
        {
            1-> {
                intext1.setTextColor(Color.parseColor("#A2007C"))
                intent.putExtra("EdiTtEXTvALUE", intext1.getText().toString());
                //intext1.textColor =Color.parseColor("#A2007C");
                //intext1.setTextColor(0x990066).toString();

                startActivity(intent);
                finish();}
            2->{
                intext1.setTextColor(Color.parseColor("#5BBD2B"))
                intent.putExtra("EdiTtEXTvALUE", intext1.getText().toString());
                //intent.putExtra("EdiTtEXTvALUE", intext1.setTextColor(0x00EE00).toString())
                startActivity(intent);
                finish();
            }
            3->{
                intext1.setTextColor(Color.parseColor("#F9F400"))
                intent.putExtra("EdiTtEXTvALUE", intext1.getText().toString());
                //intent.putExtra("EdiTtEXTvALUE", intext1.setTextColor(0x00EE00).toString())
                startActivity(intent);
                finish();
            }
            4->{
                intext1.setTextColor(Color.parseColor("#1B4F93"))
                intent.putExtra("EdiTtEXTvALUE", intext1.getText().toString());
                //intent.putExtra("EdiTtEXTvALUE", intext1.setTextColor(0x00EE00).toString())
                startActivity(intent);
                finish();
            }
            5->{
                intext1.setTextColor(Color.parseColor("#FCD9C4"))
                intent.putExtra("EdiTtEXTvALUE", intext1.getText().toString());
                //intent.putExtra("EdiTtEXTvALUE", intext1.setTextColor(0x00EE00).toString())
                startActivity(intent);
                finish();
            }
            6->{
                intext1.setTextColor(Color.parseColor("#C50023"))
                intent.putExtra("EdiTtEXTvALUE", intext1.getText().toString());
                //intent.putExtra("EdiTtEXTvALUE", intext1.setTextColor(0x00EE00).toString())
                startActivity(intent);
                finish();
            }
        }

    }

    fun btnpink(view: View){
        btn0.setBackgroundColor(Color.rgb(162,0,124));
        value=1;
    }
    fun btngreen(view: View){
        btn0.setBackgroundColor(Color.rgb(91,189,43));
        value=2;
    }
    fun btnyellow(view: View){
        btn0.setBackgroundColor(Color.rgb(249,244,0));
        value=3;
    }
    fun btnblue(view: View){
        btn0.setBackgroundColor(Color.rgb(32,90,167));
        value=4;
    }
    fun btnnude(view: View){
        btn0.setBackgroundColor(Color.rgb(252,217,196));
        value=5;
    }
    fun btnred(view: View){
        btn0.setBackgroundColor(Color.rgb(197,0,35));
        value=6;
    }
}
