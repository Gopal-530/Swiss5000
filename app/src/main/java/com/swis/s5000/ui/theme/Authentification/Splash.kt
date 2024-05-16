package com.swis.s5000.ui.theme.Authentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.swis.s5000.R

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(Runnable {


                val intent = Intent(this, WelcomeScreen1::class.java)
                startActivity(intent)
                finish()

            finish()
            //code t go new activity

        },3000L)
    }
}