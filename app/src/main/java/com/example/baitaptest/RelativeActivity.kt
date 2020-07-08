package com.example.baitaptest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative.*

class RelativeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)


        btnbai2.setOnClickListener {
            val intent : Intent = Intent(this@RelativeActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
