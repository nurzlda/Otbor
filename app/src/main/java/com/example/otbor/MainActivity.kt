package com.example.otbor

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.otbor.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn.setOnClickListener {

            val waIntent = Intent(Intent.ACTION_SEND)

            val msg = binding.edt.text
            waIntent!!.setPackage("org.telegram.messenger")
            waIntent.putExtra(Intent.EXTRA_TEXT, msg)
            waIntent!!.type = "text/plain"
            startActivity(Intent.createChooser(waIntent, "Выберите :"))


        }
    }
}