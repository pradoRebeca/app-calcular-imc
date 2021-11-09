package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class DashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        supportActionBar!!.hide()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

}