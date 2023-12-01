package com.andreas.fiedler.example.telefon_register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.andreas.fiedler.example.telefon_register.data.Adress
import com.andreas.fiedler.example.telefon_register.data.Datasource
import com.andreas.fiedler.example.telefon_register.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var dataset: List<Adress> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataset = Datasource().loadContacts()
    }
}