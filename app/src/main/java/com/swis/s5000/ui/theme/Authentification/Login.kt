package com.swis.s5000.ui.theme.Authentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.swis.s5000.R
import com.swis.s5000.databinding.ActivityLoginBinding
import com.swis.s5000.databinding.ActivityWelcomeScreen1Binding
import com.swis.s5000.ui.theme.Home.Home

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.tvRgster.setOnClickListener {

            val intent = Intent(this, Register::class.java)
            startActivity(intent)
           // finish()

        }
        binding.tvLogin.setOnClickListener {

            val intent = Intent(this, Home::class.java)
            startActivity(intent)
           // finish()

        }
    }
}