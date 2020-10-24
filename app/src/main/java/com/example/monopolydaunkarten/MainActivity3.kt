package com.example.monopolydaunkarten

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import java.util.*


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var home = true

        var start2 = findViewById<Button>(R.id.start2)

        val switch2 = findViewById<Switch>(R.id.switch2)

        val action = findViewById<ImageView>(R.id.action2)
        val logo2 = findViewById<ImageView>(R.id.logo2)
        logo2.isInvisible = false
        action.isInvisible = true

        val street_1 = findViewById<Button>(R.id.street_1)
        val street_2 = findViewById<Button>(R.id.street_2)
        val street_3 = findViewById<Button>(R.id.street_3)
        val street_4 = findViewById<Button>(R.id.street_4)
        val street_5 = findViewById<Button>(R.id.street_5)
        val street_6 = findViewById<Button>(R.id.street_6)
        val street_7 = findViewById<Button>(R.id.street_7)
        val street_8 = findViewById<Button>(R.id.street_8)
        val street_9 = findViewById<Button>(R.id.street_9)
        val street_10 = findViewById<Button>(R.id.street_10)
        val street_11 = findViewById<Button>(R.id.street_11)
        val street_12 = findViewById<Button>(R.id.street_12)
        val street_13 = findViewById<Button>(R.id.street_13)
        val street_14 = findViewById<Button>(R.id.street_14)
        val street_15 = findViewById<Button>(R.id.street_15)
        val street_16 = findViewById<Button>(R.id.street_16)
        val street_17 = findViewById<Button>(R.id.street_17)
        val street_18 = findViewById<Button>(R.id.street_18)
        val street_19 = findViewById<Button>(R.id.street_19)
        val street_20 = findViewById<Button>(R.id.street_20)
        val street_21 = findViewById<Button>(R.id.street_21)
        val street_22 = findViewById<ImageView>(R.id.street_22) // Bahnhof
        val street_23 = findViewById<Button>(R.id.street_23)


        fun changeMode() {
            street_1.isInvisible = true
            street_2.isInvisible = true
            street_3.isInvisible = true
            street_4.isInvisible = true
            street_5.isInvisible = true
            street_5.isInvisible = true
            street_6.isInvisible = true
            street_7.isInvisible = true
            street_8.isInvisible = true
            street_9.isInvisible = true
            street_10.isInvisible = true
            street_11.isInvisible = true
            street_12.isInvisible = true
            street_13.isInvisible = true
            street_14.isInvisible = true
            street_15.isInvisible = true
            street_16.isInvisible = true
            street_17.isInvisible = true
            street_18.isInvisible = true
            street_19.isInvisible = true
            street_20.isInvisible = true
            street_21.isInvisible = true
            street_22.isInvisible = true
            street_23.isInvisible = true

            logo2.isInvisible = true
            action.isInvisible = false
        }



        street_1.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_1)
                action.isInvisible = false
                home = false
            }
        }
        street_2.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_2)
                action.isInvisible = false
                home = false
            }
        }
        street_3.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_3)
                action.isInvisible = false
                home = false
            }
        }
        street_4.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_4)
                action.isInvisible = false
                home = false
            }
        }
        street_5.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_5)
                action.isInvisible = false
                home = false
            }
        }
        street_6.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_6)
                action.isInvisible = false
                home = false
            }
        }
        street_7.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_7)
                action.isInvisible = false
                home = false
            }
        }
        street_8.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_8)
                action.isInvisible = false
                home = false
            }
        }
        street_9.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_9)
                action.isInvisible = false
                home = false
            }
        }
        street_10.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_10)
                action.isInvisible = false
                home = false
            }
        }
        street_11.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_11)
                action.isInvisible = false
                home = false
            }
        }
        street_12.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_12)
                action.isInvisible = false
                home = false
            }
        }
        street_13.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_13)
                action.isInvisible = false
                home = false
            }
        }
        street_14.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_14)
                action.isInvisible = false
                home = false
            }
        }
        street_15.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_15)
                action.isInvisible = false
                home = false
            }
        }
        street_16.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_16)
                action.isInvisible = false
                home = false
            }
        }
        street_17.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_17)
                action.isInvisible = false
                home = false
            }
        }
        street_18.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_18)
                action.isInvisible = false
                home = false
            }
        }
        street_19.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_19)
                action.isInvisible = false
                home = false
            }
        }
        street_20.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_20)
                action.isInvisible = false
                home = false
            }
        }
        street_21.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_21)
                action.isInvisible = false
                home = false
            }
        }
        street_22.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_22)
                action.isInvisible = false
                home = false
            }
        }
        street_23.setOnClickListener {
            if(home){
                changeMode()
                action.setImageResource(R.drawable.s_23)
                action.isInvisible = false
                home = false
            }
        }






        switch2.setOnClickListener {

            openActivity2()
        }

        start2.setOnClickListener{
            street_1.isInvisible = false
            street_2.isInvisible = false
            street_3.isInvisible = false
            street_4.isInvisible = false
            street_5.isInvisible = false
            street_6.isInvisible = false
            street_7.isInvisible = false
            street_8.isInvisible = false
            street_9.isInvisible = false
            street_10.isInvisible = false
            street_11.isInvisible = false
            street_12.isInvisible = false
            street_13.isInvisible = false
            street_14.isInvisible = false
            street_15.isInvisible = false
            street_16.isInvisible = false
            street_17.isInvisible = false
            street_18.isInvisible = false
            street_19.isInvisible = false
            street_20.isInvisible = false
            street_21.isInvisible = false
            street_22.isInvisible = false
            street_23.isInvisible = false

            action.isInvisible = true

            logo2.isInvisible = false
            home = true
        }


    }
    fun openActivity2() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }



}