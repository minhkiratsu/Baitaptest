package com.example.baitaptest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnbai1.setOnClickListener {
            val intent:Intent = Intent(this@MainActivity, RelativeActivity::class.java)
            startActivity(intent)
        }
    }
}
