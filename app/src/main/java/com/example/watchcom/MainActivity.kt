package com.example.watchcom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.watchcom.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, HomeFragment::class.java, null).commit()
    }
}