package com.famous.yorubatrans

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.famous.yorubatrans.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.transButton.setOnClickListener {
            startActivity(Intent(this, TranslateActivity::class.java))
        }
    }

}