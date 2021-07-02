package com.famous.yorubatrans

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.famous.yorubatrans.databinding.ActivityMainBinding
import com.famous.yorubatrans.databinding.ActivityTranslateBinding

class TranslateActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTranslateBinding

    private lateinit var yorubaTxt: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTranslateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.TranslateBtn.setOnClickListener {
             yorubaTxt = binding.yorubaInput.text.toString()
            var meaning = binding.meaningText.text
            when(yorubaTxt){

                "Ekaro" -> meaning = "Good Morning"
                "Ekaale" -> meaning = "Good Evening"
                "Odaaro" -> meaning = "Good Night"
                "Ekasan" -> meaning = "Good Aftnoon"
                "Ounje" -> meaning = "Food"
                "Ibi" -> meaning = "Place"
                "Iji" -> meaning = "Storm"
                "Eru" -> meaning = "Load"
                "Aya" -> meaning = "Wife"
                "Ara" -> meaning = "Body"
                "Ekun" -> meaning = "Tears"
                "Okan" -> meaning = "Heart"
                "Bere" -> meaning = "Began"
                "Oko" -> meaning = "Husband"
                "Mun" -> meaning = "Drink it"
                "Oja" -> meaning = "Market"
                "Fun" -> meaning = "Give it"
                "Ose" -> meaning = "Thank You"
                "Ahon" -> meaning = "Tongue"
                "Nkan" -> meaning = "Something"
                "Rin" -> meaning = "Walk"

                else -> checkGoogle()
            }
        }
    }

    private fun checkGoogle() {
        val queryUrl: Uri = Uri.parse("${"https://www.google.com/search?q="}${yorubaTxt}")
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        startActivity(intent)
    }


}