package com.example.multiplerecyclerviews.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviews.databinding.ClothingLayoutBinding
import com.example.multiplerecyclerviews.model.RecyclerData

class ClothingAdapter(private val context: Context, private val data: ArrayList<RecyclerData>) :
    RecyclerView.Adapter<ClothingAdapter.clothingViewHolderClass>() {
    class clothingViewHolderClass(binding: ClothingLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val imageView: ImageView = binding.clothingImage
        val nameTextView: TextView = binding.clothingOffer
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): clothingViewHolderClass {
        val binding = ClothingLayoutBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false
        )
        return clothingViewHolderClass(binding)
    }

    override fun onBindViewHolder(holder: clothingViewHolderClass, position: Int) {
        holder.imageView.setImageResource(data[position].image)
        holder.nameTextView.text = data[position].offer
    }

    override fun getItemCount(): Int {
        return data.size
    }
}