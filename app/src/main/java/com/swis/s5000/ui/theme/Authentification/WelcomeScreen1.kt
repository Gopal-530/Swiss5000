package com.swis.s5000.ui.theme.Authentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.swis.s5000.R
import com.swis.s5000.databinding.ActivityWelcomeScreen1Binding

class WelcomeScreen1 : AppCompatActivity() {


    private lateinit var binding: ActivityWelcomeScreen1Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_welcome_screen1)

        binding = ActivityWelcomeScreen1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.Image1.setOnClickListener {

            val intent = Intent(this, WelcomeScreen2::class.java)
            startActivity(intent)
           // finish()

        }



    }
}