package com.example.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.currencyconverter.adapters.Adapter
import com.example.currencyconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView(){
        val fromAdapter = Adapter()
        val fromRecyclerView = binding.fromRV
        fromAdapter.elements = viewModel.listCurrency
        fromRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        fromRecyclerView.adapter = fromAdapter

        val toAdapter = Adapter()
        val toRecyclerView = binding.toRV
        toAdapter.elements = viewModel.listCurrency
        toRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        toRecyclerView.adapter = toAdapter

        binding.fromTextView.text = "1"
    }
}