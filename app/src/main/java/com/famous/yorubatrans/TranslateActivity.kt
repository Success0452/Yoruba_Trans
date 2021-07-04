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

                "Ekaro" -> binding.meaningText.text = "Good Morning"
                "Ekaale" -> binding.meaningText.text = "Good Evening"
                "Odaaro" -> binding.meaningText.text = "Good Night"
                "Ekasan" -> binding.meaningText.text = "Good Aftnoon"
                "Ounje" -> binding.meaningText.text = "Food"
                "Ibi" -> binding.meaningText.text = "Place"
                "Iji" -> binding.meaningText.text = "Storm"
                "Eru" -> binding.meaningText.text = "Load"
                "Aya" -> binding.meaningText.text = "Wife"
                "Ara" -> binding.meaningText.text = "Body"
                "Ekun" -> binding.meaningText.text = "Tears"
                "Okan" -> binding.meaningText.text = "Heart"
                "Bere" -> binding.meaningText.text = "Began"
                "Oko" -> binding.meaningText.text = "Husband"
                "Mun" -> binding.meaningText.text = "Drink it"
                "Oja" -> binding.meaningText.text = "Market"
                "Fun" -> binding.meaningText.text = "Give it"
                "Ose" -> binding.meaningText.text = "Thank You"
                "Ahon" -> binding.meaningText.text = "Tongue"
                "Nkan" -> binding.meaningText.text = "Something"
                "Rin" -> binding.meaningText.text = "Walk"

                else -> checkGoogle()
            }
        }
    }

    private fun checkGoogle() {
        val queryUrl: Uri = Uri.parse("${"https://www.google.com/search?q="}${yorubaTxt} in Yoruba to English")
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        startActivity(intent)
    }


}