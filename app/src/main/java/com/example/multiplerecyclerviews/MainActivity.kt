package com.example.multiplerecyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.multiplerecyclerviews.databinding.ActivityMainBinding
import com.example.multiplerecyclerviews.viewModel.MainViewModel
import com.example.multiplerecyclerviews.viewModel.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        viewModel = ViewModelProvider(this, MainViewModelFactory(applicationContext))[MainViewModel::class.java]

        // Setting The RecyclerViews

        // Best Seller RecyclerView
        viewModel.setRecyclerView(mainBinding.bestSellerRecyclerView, mainBinding, mainBinding.root)
        // Best Seller 2 RecyclerView
        viewModel.setRecyclerView(mainBinding.bestSeller2RecyclerView, mainBinding, mainBinding.root)
        // Offer RecyclerView
        viewModel.setRecyclerView(mainBinding.offerRecyclerView, mainBinding, mainBinding.root)
        // Clothing RecyclerView
        viewModel.setRecyclerView(mainBinding.clothingRecyclerView, mainBinding, mainBinding.root)
    }
}