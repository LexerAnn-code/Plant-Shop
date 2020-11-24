package com.app.plantstoreapp

import com.app.plantshop.R

object MockData3 {
    fun catergoryplants():MutableList<Plant>{
        val category= mutableListOf<Plant>()

        for ( i in 0 until 1){
         val plant1=Plant("Aglaonema","45",R.drawable.image1,"","","")
         val plant2=Plant("Aglaonema","45",R.drawable.image2,"","","")
         val plant3=Plant("Aglaonema","45",R.drawable.image6,"","","")
//         val plant4=Plant("Aglaonema","45","","","","")
//         val plant5=Plant("Aglaonema","45","","","","")

            category.add(plant1)
            category.add(plant2)
            category.add(plant3)
//            category.add(plant4)
//            category.add(plant5)

        }
        return category

    }
}