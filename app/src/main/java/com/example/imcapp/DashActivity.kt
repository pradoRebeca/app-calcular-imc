package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class DashActivity : AppCompatActivity() {

    lateinit var tvNome : TextView
    lateinit var tvProfissao : TextView
    lateinit var tvAltura : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        supportActionBar!!.hide()

        tvNome = findViewById(R.id.dash_nome_usuario)
        tvProfissao = findViewById(R.id.dash_profissao)
        tvAltura = findViewById(R.id.dash_altura)

        val arquivo = getSharedPreferences("cadastro", MODE_PRIVATE)

        tvNome.text = arquivo.getString("nome", "")
        tvProfissao.text = arquivo.getString("profissao", "")
        tvAltura.text = arquivo.getFloat("altura",0.0f).toString()

    }
}