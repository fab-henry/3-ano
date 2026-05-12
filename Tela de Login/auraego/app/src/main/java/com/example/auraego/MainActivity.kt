package com.example.auraego

import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        var edt_usuario = findViewById<EditText>(R.id.edt_usuario)
        var edt_senha = findViewById<EditText>(R.id.edt_senha)
        var bt_entrar = findViewById<Button>(R.id.bt_entrar)



        val senha = "1234"
        val usuario = "adm@gmail.com"

        bt_entrar.setOnClickListener {
            var txt_usuario = edt_usuario.text.toString()
            var txt_senha = edt_senha.text.toString()

            if (txt_senha == senha && txt_usuario == usuario) {
                Toast.makeText(this, "Acesso concedido! Podeeee entraaaar", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "Erro, tente novamente", Toast.LENGTH_SHORT).show()
            }
        }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}