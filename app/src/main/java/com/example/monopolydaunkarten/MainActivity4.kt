package com.example.monopolydaunkarten

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val jaa = findViewById<Button>(R.id.jaa)
        val nee = findViewById<Button>(R.id.nee)


        jaa.setOnClickListener(){
            val mPrefs = getSharedPreferences("label", 0)
            var life = mPrefs.getString("tag", "0")?.toInt() ?:0

            val mEditor = mPrefs.edit()
            life -= 1
            if(life < 0){
                life = 0
            }
            finish()
            mEditor.putString("tag", life.toString()).apply()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        nee.setOnClickListener(){
            finish()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}
