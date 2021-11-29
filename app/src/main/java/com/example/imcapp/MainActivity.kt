package com.example.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var  editEmail : EditText
    lateinit var  editSenha : EditText
    lateinit var  btnEntrar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        //instanciar o botão entar
        val btnNovoUsuario = findViewById<Button>(R.id.btn_criar_conta)

        editEmail = findViewById(R.id.edit_login_email)
        editSenha = findViewById(R.id.edit_login_senha)
        btnEntrar = findViewById(R.id.btn_entrar)

        btnEntrar.setOnClickListener {
            login()
        }

        //criar um listener - ouvinte
        btnNovoUsuario.setOnClickListener {
            //criar uma intent
            val abrirCadastro = Intent(this, CadastroActivity::class.java)
            startActivity(abrirCadastro)
        }
    }

    private fun login() {
        val arquivo = getSharedPreferences("cadastro", MODE_PRIVATE)
        val email = arquivo.getString("email", "")
        val senha = arquivo.getString("senha", "")

        if(editEmail.text.toString() == email && editSenha.text.toString() == senha){
            val intent = Intent(this, DashActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Usuario ou senha incorreto", Toast.LENGTH_SHORT).show()
        }
    }
}