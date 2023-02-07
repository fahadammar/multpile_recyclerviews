package com.example.multiplerecyclerviews.viewModel

import android.content.Context
import android.view.View
import android.widget.LinearLayout
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviews.adapters.BestSeller2Adapter
import com.example.multiplerecyclerviews.adapters.BestSellerAdapter
import com.example.multiplerecyclerviews.adapters.ClothingAdapter
import com.example.multiplerecyclerviews.adapters.OfferAdapter
import com.example.multiplerecyclerviews.databinding.ActivityMainBinding
import com.example.multiplerecyclerviews.model.RecyclerDataRepository

class MainViewModel(val context: Context) : ViewModel() {
    private val offerAdapter = OfferAdapter(context, RecyclerDataRepository.getOffersData())
    private val clothingAdapter = ClothingAdapter(context, RecyclerDataRepository.getClothingData())
    private val bestSellerAdapter = BestSellerAdapter(context, RecyclerDataRepository.getBestSellersData())
    private val bestSeller2Adapter = BestSeller2Adapter(context, RecyclerDataRepository.getBestSellersData_2())

    fun setRecyclerView(recyclerView: RecyclerView, binding: ActivityMainBinding, view: View) {
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        when (view.id) {
            binding.offerRecyclerView.id -> {
                recyclerView.adapter = offerAdapter
            }
            binding.clothingRecyclerView.id -> {
                recyclerView.adapter = clothingAdapter
            }
            binding.bestSellerRecyclerView.id -> {
                recyclerView.adapter = bestSellerAdapter
            }
            binding.bestSeller2RecyclerView.id -> {
                recyclerView.adapter = bestSeller2Adapter
            }
        }
    }
}