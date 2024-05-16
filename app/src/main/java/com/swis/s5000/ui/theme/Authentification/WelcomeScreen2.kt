package com.swis.s5000.ui.theme.Authentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.swis.s5000.R
import com.swis.s5000.databinding.ActivityWelcomeScreen1Binding
import com.swis.s5000.databinding.ActivityWelcomeScreen2Binding

class WelcomeScreen2 : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeScreen2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   setContentView(R.layout.activity_welcome_screen2)

        binding = ActivityWelcomeScreen2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.Image1.setOnClickListener {

            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()

        }

        binding.Image2.setOnClickListener {
            onBackPressed()

        }



    }
}