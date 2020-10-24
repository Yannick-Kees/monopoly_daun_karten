package com.example.monopolydaunkarten

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity2 : AppCompatActivity() {
    @SuppressLint("CommitPrefEdits")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val home_button = findViewById<Button>(R.id.start)
        val action = findViewById<ImageView>(R.id.action)
        val ereignis = findViewById<ImageView>(R.id.ereignis)
        val gemein = findViewById<ImageView>(R.id.gemein)
        val logo = findViewById<ImageView>(R.id.logo)
        val switch1 = findViewById<Switch>(R.id.switch1)
        val prison_counter_text = findViewById<TextView>(R.id.prison_counter_text)
        val prison = findViewById<ImageView>(R.id.prison)

        val anz_ereignisse = 16
        val anz_gemeinschaft = 14

        var start = true


        val mPrefs = getSharedPreferences("label", 0)
        var life = mPrefs.getString("tag", "0")?.toInt() ?:0

        val mEditor = mPrefs.edit()


        mEditor.putString("tag", life.toString()).apply()

        prison_counter_text.text = life.toString()

        if (life == 0){
            prison.setImageResource(R.drawable.inprison)
        }else{
            prison.setImageResource(R.drawable.outprison)
        }

        @SuppressLint("CommitPrefEdits")
        fun loose_a_life(){
            finish()
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        fun gain_a_life(){
            if (life == 0){
                prison.setImageResource(R.drawable.outprison)
            }
            life += 1
            mEditor.putString("tag", life.toString()).apply()
            prison_counter_text.text = life.toString()
        }


        action.imageAlpha = 0

        ereignis.setOnClickListener{
            if(start) {
                val rdm = Random().nextInt(anz_ereignisse) + 1

                if(rdm == 11){
                    gain_a_life()
                }

                val id = resources.getIdentifier("e_$rdm", "drawable", packageName)
                action.setImageResource(id)

                ereignis.imageAlpha = 0
                gemein.imageAlpha = 0
                logo.imageAlpha = 0
                action.imageAlpha = 255
                start = false
            }
        }

        gemein.setOnClickListener{

            if(start) {
                val rdm = Random().nextInt(anz_gemeinschaft) + 1

                if(rdm == 1){
                    gain_a_life()
                }

                val id = resources.getIdentifier("g_$rdm", "drawable", packageName)
                action.setImageResource(id)

                ereignis.imageAlpha = 0
                logo.imageAlpha = 0
                gemein.imageAlpha = 0
                action.imageAlpha = 255
                start = false
            }
        }



        home_button.setOnClickListener{
            ereignis.imageAlpha = 255
            logo.imageAlpha = 255
            gemein.imageAlpha = 255
            action.imageAlpha = 0
            start = true
        }

        switch1.setOnClickListener {
            openActivity3()
        }

        prison.setOnClickListener {
            if(life != 0){
                loose_a_life()
            }
        }
    }

    fun openActivity3() {
        finish()
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }



}
