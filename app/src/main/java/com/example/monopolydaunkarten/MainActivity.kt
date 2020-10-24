package com.example.monopolydaunkarten

import android.content.Intent
import android.icu.lang.UCharacter
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.constraintlayout.solver.widgets.WidgetContainer
import androidx.recyclerview.widget.DividerItemDecoration


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changer1 = findViewById<Button>(R.id.changer1)
        val changer2 = findViewById<Button>(R.id.changer2)


        changer1.setOnClickListener{
            openActivity2();
        }
        changer2.setOnClickListener{
            openActivity3();
        }



}
    fun openActivity2() {
        finish()
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
    fun openActivity3() {
        finish()
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
}
