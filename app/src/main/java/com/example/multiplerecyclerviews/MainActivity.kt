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

        /*
            getting the view. well its not used, else if used then we'll get to know, whether it was right view or not
            we can also get the view as I read last time via the binding.root
        */
        val view = window.decorView.rootView

        viewModel = ViewModelProvider(this, MainViewModelFactory(applicationContext))[MainViewModel::class.java]

        // Setting The RecyclerViews

        // Best Seller RecyclerView
        viewModel.setRecyclerView(mainBinding.bestSellerRecyclerView, mainBinding, mainBinding.bestSellerRecyclerView.id)
        // Best Seller 2 RecyclerView
        viewModel.setRecyclerView(mainBinding.bestSeller2RecyclerView,mainBinding, mainBinding.bestSeller2RecyclerView.id)
        // Offer RecyclerView
        viewModel.setRecyclerView(mainBinding.offerRecyclerView, mainBinding, mainBinding.offerRecyclerView.id)
        // Clothing RecyclerView
        viewModel.setRecyclerView(mainBinding.clothingRecyclerView, mainBinding, mainBinding.clothingRecyclerView.id)
    }
}