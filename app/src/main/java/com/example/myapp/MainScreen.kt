package com.example.myapp

import android.content.Intent
import android.os.Bundle
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import android.provider.ContactsContract
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.databinding.ActivityMainBinding
import com.example.myapp.databinding.ActivityMainScreenBinding

class MainScreen : AppCompatActivity() {
    private lateinit var binding: ActivityMainScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("USERNAME")

        binding.content.text =
            if (!username.isNullOrEmpty()) "Hello $username 🤗"
            else "Hello"

        binding.iv1.setOnClickListener {
        val intent = Intent(this, Notification::class.java)
        startActivity(intent)
        }

        val task = intent.getStringExtra("TASK_TEXT")
            binding.blank.text = task


        binding.daily1.setOnClickListener {
            val intent = Intent(this, DailyChallenge::class.java)
            startActivity(intent)
        }

        binding.iv2.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        val tvDateDay = findViewById<TextView>(R.id.tvDateDay)

        val today = LocalDate.now()

        val formatter = DateTimeFormatter.ofPattern("EEEE,dd,MMM")
        val formattedDate = today.format(formatter)

        tvDateDay.text = formattedDate


    }
}