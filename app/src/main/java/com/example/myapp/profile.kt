package com.example.myapp

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.databinding.ActivityProfileBinding

class profile : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.task1.setOnClickListener {
                val dialog = AlertDialog.Builder(this)
                    .setTitle("Attention!")
                    .setMessage("Streak maintained")
                    .setPositiveButton("OK") { dialog, _->
                        dialog.dismiss()
                    }
                    .setNegativeButton("Cancel", null)
                    .create()

                dialog.show()
            }

    }
}