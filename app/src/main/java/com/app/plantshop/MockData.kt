package com.app.plantstoreapp

object MockData {
    fun catergoryNames():MutableList<Category>{
        val category= mutableListOf<Category>()
        val det= mutableListOf<CategoryList>()
        val det2= mutableListOf<CategoryList>()
        val det3= mutableListOf<CategoryList>()

        for ( i in 0 until 1){
           var details2=CategoryList("Mango","12.50")
           var details3=CategoryList("Mango","12.50")
           var details4=CategoryList("Mango","12.50")
            det.add(details2)
            det.add(details3)
            det.add(details4)
            val cate=Category("Top Plant", det)



            var details5=CategoryList("Orange","12.50")
            var details6=CategoryList("Orange","12.50")
            var details7=CategoryList("Orange","12.50")
            det2.add(details5)
            det2.add(details6)
            det2.add(details7)
            val cate3=Category("Indoor",det2)

            var details8=CategoryList("Pineapple","12.50")
            var details9=CategoryList("Pineapple","12.50")
            var details10=CategoryList("Pineapple","12.50")
            det3.add(details10)
            det3.add(details9)
            det3.add(details8)
            val cate4=Category("Top Plant", det3)

            category.add(cate)
            category.add(cate3)
            category.add(cate4)

        }
        return category

    }
}