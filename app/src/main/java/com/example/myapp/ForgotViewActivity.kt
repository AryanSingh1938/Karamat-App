package com.example.myapp

import android.app.AlertDialog
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.databinding.ActivityForgotViewBinding
import com.example.myapp.databinding.ActivityMainBinding

class ForgotViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForgotViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_view)

        binding = ActivityForgotViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.MSM.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
                .setTitle("Attention!")
                .setMessage("SMS sent")
                .setPositiveButton("OK") { dialog, _->
                    dialog.dismiss()
                }
                .setNegativeButton("Cancel", null)
                .create()

            dialog.show()
        }
    }
}