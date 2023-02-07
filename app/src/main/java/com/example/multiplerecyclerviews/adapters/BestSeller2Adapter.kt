package com.example.multiplerecyclerviews.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviews.databinding.BestSellerLayoutBinding
import com.example.multiplerecyclerviews.model.RecyclerData

class BestSeller2Adapter(val context: Context, val data: ArrayList<RecyclerData>) :
    RecyclerView.Adapter<BestSeller2Adapter.innerViewHolderClass>() {
    class innerViewHolderClass(binding: BestSellerLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        val image = binding.bestSellerImage
        val text = binding.bestSellerText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): innerViewHolderClass {
        val binding = BestSellerLayoutBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false
        )
        return innerViewHolderClass(binding)
    }

    override fun onBindViewHolder(holder: innerViewHolderClass, position: Int) {
        holder.text.text = data[position].offer
        holder.image.setImageResource(data[position].image)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}