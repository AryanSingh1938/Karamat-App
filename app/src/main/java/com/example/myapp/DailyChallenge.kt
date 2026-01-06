package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.databinding.ActivityDailyChallengeBinding

class DailyChallenge : AppCompatActivity() {
    private lateinit var binding: ActivityDailyChallengeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDailyChallengeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val etTask = findViewById<EditText>(R.id.etTask)
        val tvTask = findViewById<TextView>(R.id.tvTask)
        val btnAdd = findViewById<Button>(R.id.btnAdd)


        binding.btnAdd.setOnClickListener {
            val text = etTask.text.toString().trim()

            if(text.isNotEmpty()) {
                tvTask.text = text
                etTask.text.clear()
            }
        }

        binding.btnAdd.setOnClickListener {
            val text = etTask.text.toString().trim()
            if (text.isNotEmpty()) {
                val intent = Intent(this, MainScreen::class.java)
                intent.putExtra("TASK_TEXT", text)
                startActivity(intent)
            }
        }

    }
}