package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvForgot.setOnClickListener {
            val intent = Intent(this, ForgotViewActivity::class.java)
            startActivity(intent)
        }

        binding.signing.setOnClickListener {
            val intent = Intent(this, Sign::class.java)
            startActivity(intent)
        }
        binding.Continue.setOnClickListener {

            val username = binding.et1.text.toString().trim()

            if(username.isEmpty()) {
                binding.et1.error = "Enter username"
                return@setOnClickListener
            }


            val intent = Intent(this, MainScreen::class.java)
            intent.putExtra("USERNAME",username)
            startActivity(intent)
        }

    }
}







