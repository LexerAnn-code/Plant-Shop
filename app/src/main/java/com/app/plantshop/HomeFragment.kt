package com.app.plantstoreapp

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.plantshop.R
import kotlinx.android.synthetic.main.categoryitem.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(),CaterogyClicked {
    private lateinit var clicked: CaterogyClicked


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler1.apply {
            adapter=RecyclerViewAdapter(this@HomeFragment.requireContext(),this@HomeFragment).also {
                it.submitList(MockData.catergoryNames())
            }
            layoutManager=LinearLayoutManager(this@HomeFragment.requireContext(),RecyclerView.HORIZONTAL,false)
        }
        recycler2.apply {
            adapter=RecyclerViewAdapter2(this@HomeFragment.requireContext()).also {
                it.submitList(MockData3.catergoryplants())
            }
            layoutManager=LinearLayoutManager(this@HomeFragment.requireContext(),RecyclerView.HORIZONTAL,false)
        }
    }

    override fun caterogyClicked(category: Category) {
        debugger("->>>>>>>>${category.details}")
        print(category.details)
        //        recycler1.apply {
//            adapter=RecyclerViewAdapter(this@HomeFragment.requireContext(),this@HomeFragment).also {
//                it.submitList(MockData2.catergoryName2())
//            }
//        }
    }


}