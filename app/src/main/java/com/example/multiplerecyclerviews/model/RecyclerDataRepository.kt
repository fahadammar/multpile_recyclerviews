package com.example.multiplerecyclerviews.model

import com.example.multiplerecyclerviews.R

class RecyclerDataRepository {
    companion object {
        fun getOffersData(): ArrayList<RecyclerData> {
            var arrayList: ArrayList<RecyclerData> = ArrayList()

            arrayList.add(RecyclerData(R.drawable.bags, "Offer is 35% Off"))
            arrayList.add(RecyclerData(R.drawable.mobiles, "Offer is 25% Off"))
            arrayList.add(RecyclerData(R.drawable.tv_offer, "Offer is 15% Off"))
            arrayList.add(RecyclerData(R.drawable.nikon_canon_offer, "Offer is 35% Off"))
            arrayList.add(RecyclerData(R.drawable.watches, "Offer is 75% Off"))
            arrayList.add(RecyclerData(R.drawable.levis_clothing, "Offer is 45% Off"))

            return arrayList
        }

        fun getBestSellersData(): ArrayList<RecyclerData> {
            var arrayList: ArrayList<RecyclerData> = ArrayList()

            arrayList.add(RecyclerData(R.drawable.tv_offer, "Offer is 15% Off"))
            arrayList.add(RecyclerData(R.drawable.nikon_canon_offer, "Offer is 35% Off"))
            arrayList.add(RecyclerData(R.drawable.watches, "Offer is 75% Off"))
            arrayList.add(RecyclerData(R.drawable.bags, "Offer is 35% Off"))
            arrayList.add(RecyclerData(R.drawable.mobiles, "Offer is 25% Off"))
            arrayList.add(RecyclerData(R.drawable.levis_clothing, "Offer is 45% Off"))

            return arrayList
        }

        fun getBestSellersData_2(): ArrayList<RecyclerData> {
            var arrayList: ArrayList<RecyclerData> = ArrayList()

            arrayList.add(RecyclerData(R.drawable.mobiles, "Offer is 25% Off"))
            arrayList.add(RecyclerData(R.drawable.levis_clothing, "Offer is 45% Off"))
            arrayList.add(RecyclerData(R.drawable.tv_offer, "Offer is 15% Off"))
            arrayList.add(RecyclerData(R.drawable.nikon_canon_offer, "Offer is 35% Off"))
            arrayList.add(RecyclerData(R.drawable.watches, "Offer is 75% Off"))
            arrayList.add(RecyclerData(R.drawable.bags, "Offer is 35% Off"))


            return arrayList
        }

        fun getClothingData(): ArrayList<RecyclerData> {
            var arrayList: ArrayList<RecyclerData> = ArrayList()

            arrayList.add(RecyclerData(R.drawable.offer_shoping, "Offer is 25% Off"))
            arrayList.add(RecyclerData(R.drawable.levis_clothing, "Offer is 45% Off"))
            arrayList.add(RecyclerData(R.drawable.women_clothing, "Offer is 15% Off"))
            arrayList.add(RecyclerData(R.drawable.nikon_canon_offer, "Offer is 35% Off"))
            arrayList.add(RecyclerData(R.drawable.bags, "Offer is 75% Off"))
            arrayList.add(RecyclerData(R.drawable.mobiles, "Offer is 35% Off"))


            return arrayList
        }
    }
}