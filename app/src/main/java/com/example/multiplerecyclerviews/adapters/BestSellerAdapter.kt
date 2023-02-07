package com.example.multiplerecyclerviews.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviews.databinding.BestSellerLayoutBinding
import com.example.multiplerecyclerviews.model.RecyclerData

class BestSellerAdapter(private val context: Context, private val data: ArrayList<RecyclerData>) :
    RecyclerView.Adapter<BestSellerAdapter.offerViewHolderClass>() {

    class offerViewHolderClass(binding: BestSellerLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        // the bindings are of the layouts made for the RecyclerView adapter to pollute
        val image = binding.bestSellerImage
        val text = binding.bestSellerText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): offerViewHolderClass {
        val binding: BestSellerLayoutBinding = BestSellerLayoutBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false
        )
        return offerViewHolderClass(binding)
    }

    override fun onBindViewHolder(holder: offerViewHolderClass, position: Int) {
        holder.image.setImageResource(data[position].image)
        holder.text.text = data[position].offer
    }

    override fun getItemCount(): Int {
        return data.size
    }
}