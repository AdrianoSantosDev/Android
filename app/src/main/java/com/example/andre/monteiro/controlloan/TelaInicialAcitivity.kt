package com.example.andre.monteiro.controlloan

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tela_inicial_acitivity.*
import kotlinx.android.synthetic.main.toolbar.*

class TelaInicialActivity : DebugActivity() {

    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial_acitivity)










        val args = intent.extras

        val nome = args?.getString("nome")


        val n=intent.getIntExtra("nome",0)

        Toast.makeText(context, "Parâmetro: $nome", Toast.LENGTH_LONG).show()
        Toast.makeText(context, "Numero: $n", Toast.LENGTH_LONG).show()

       setSupportActionBar(toolbar)

        supportActionBar?.title = "Painel"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }





    fun cliqueSair() {
        val returnIntent = Intent();
        returnIntent.putExtra("result","Saída do Control Loan");
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_buscar) {
            Toast.makeText(this,"clicou em buscar", Toast.LENGTH_LONG).show()
        }
        else if (id == R.id.action_atualizar) {
                Toast.makeText(this,"clicou em atualizar", Toast.LENGTH_LONG).show()

        }
        else if (id == R.id.action_config) {
            Toast.makeText(this, "clicou em configurações", Toast.LENGTH_LONG).show()
        }
        else if (id == android.R.id.home){
            finish()
        }


            return super.onOptionsItemSelected(item)
    }

}


