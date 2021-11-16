package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText

class CadastroActivity : AppCompatActivity() {
    lateinit var editEmail : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        editEmail = findViewById(R.id.edit_novo_email)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //Salvar os dados do usuario em um sharedPreferences
        //criar um arquivo sharedpreferences
        //se o arquivo já existir, será aberto

        //mode private só poderá ser editado pelo aplicativo
        val dados = getSharedPreferences("cadastro", MODE_PRIVATE)

        //Criar um editor para o arquivo -> só será necesario se for modificar o arquivo
        val editor = dados.edit()
        editor.putString("email", editEmail.text.toString())
        editor.apply()

        return true
    }


}