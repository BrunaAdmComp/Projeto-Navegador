package br.com.projetonavegador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val intentTelaLogin = Intent(this@SplashActivity, LoginActivity::class.java)
        Handler().postDelayed({
            startActivity(intentTelaLogin)
            finish()
        },5000)
    }
}
