package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.databinding.ActivityMainBinding
import com.example.myapp.databinding.ActivitySignBinding
import android.graphics.Color

class Sign : AppCompatActivity() {

    private lateinit var binding: ActivitySignBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.google.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.facebook.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.tv7.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val text = "Do you have an account? LogIn"
        val spannable = SpannableString(text)

        spannable.setSpan(
            ForegroundColorSpan(Color.parseColor("#2ECC71")),
            text.indexOf("LogIn"),
            text.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE

        )

        binding.tv7.text = spannable

    }
}