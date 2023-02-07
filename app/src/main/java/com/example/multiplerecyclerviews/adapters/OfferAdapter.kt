package com.example.multiplerecyclerviews.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviews.databinding.OfferLayoutBinding
import com.example.multiplerecyclerviews.model.RecyclerData

class OfferAdapter(val context: Context, val data: ArrayList<RecyclerData>) :
    RecyclerView.Adapter<OfferAdapter.offerViewHolderClass>() {
    class offerViewHolderClass(binding: OfferLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val image = binding.offerIv
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): offerViewHolderClass {
        val binding = OfferLayoutBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false
        )

        return offerViewHolderClass(binding)
    }

    override fun onBindViewHolder(holder: offerViewHolderClass, position: Int) {
        holder.image.setImageResource(data[position].image)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}