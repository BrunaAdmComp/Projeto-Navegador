package br.com.projetonavegador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnEnviar.setOnClickListener {
            val textoBusca = edtUrl.text.toString().trim()
            var tamanhoTextoBusca = textoBusca.length
            if(textoBusca.isEmpty()){
                Toast.makeText(this@LoginActivity, "Digite algo", Toast.LENGTH_LONG).show()
            }else if((textoBusca[0]=='w') && (textoBusca[1]=='w')&& (textoBusca[2]=='w') && (textoBusca[3]=='.')&& (textoBusca[tamanhoTextoBusca-7]=='.') && (textoBusca[tamanhoTextoBusca-6]=='c')&& (textoBusca[tamanhoTextoBusca-5]=='o') && (textoBusca[tamanhoTextoBusca-4]=='m')&& (textoBusca[tamanhoTextoBusca-3]=='.') && (textoBusca[tamanhoTextoBusca-2]=='b')&&(textoBusca[tamanhoTextoBusca-1]=='r')){//
                Toast.makeText(this@LoginActivity, "é um endereço de página web", Toast.LENGTH_LONG).show()
                wbvWeb.settings.javaScriptEnabled = true
                wbvWeb.loadUrl("http://"+ textoBusca)

            }else if((textoBusca[0]=='w') && (textoBusca[1]=='w')&& (textoBusca[2]=='w') && (textoBusca[3]=='.') && (textoBusca[tamanhoTextoBusca-4]=='.')&& (textoBusca[tamanhoTextoBusca-3]=='c') && (textoBusca[tamanhoTextoBusca-2]=='o')&&(textoBusca[tamanhoTextoBusca-1]=='m')){//
                Toast.makeText(this@LoginActivity, "é um endereço de página web", Toast.LENGTH_LONG).show()
                wbvWeb.settings.javaScriptEnabled = true
                wbvWeb.loadUrl("http://"+ textoBusca)
        }else{
            Toast.makeText(this@LoginActivity, "é uma busca Google", Toast.LENGTH_LONG).show()
            wbvWeb.settings.javaScriptEnabled = true
            wbvWeb.loadUrl("https://google.com.br/search?q="+textoBusca.replace(" ","+"))

        }
        }
        /*btnVoltar.setOnClickListener ({
            if (wbvWeb.canGoBack())
                wbvWeb.goBack()
            else
                Toast.makeText(this@LoginActivity, "Não disponivel", Toast.LENGTH_SHORT).show()
        })
        class = WebViewCliente(){
            override fun shoul
        }*/


        }
    }