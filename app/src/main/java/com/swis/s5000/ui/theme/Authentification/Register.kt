package com.swis.s5000.ui.theme.Authentification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.swis.s5000.R
import com.swis.s5000.databinding.ActivityLoginBinding
import com.swis.s5000.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_register)


        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.RegsterLlayout.setOnClickListener {

            onBackPressed()
        }
    }
}