package com.example.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        //instanciar o botão entar

        val btnNovoUsuario = findViewById<Button>(R.id.btn_criar_conta)

        //criar um listener - ouvinte
        btnNovoUsuario.setOnClickListener {
            //criar uma intent
            val abrirCadastro = Intent(this, DashActivity::class.java)
            startActivity(abrirCadastro)

        }

    }



}