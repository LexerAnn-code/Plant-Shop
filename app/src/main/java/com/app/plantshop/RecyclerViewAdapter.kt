package com.app.plantstoreapp

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.app.plantshop.R
import kotlinx.android.synthetic.main.categoryitem.view.*

class RecyclerViewHolder(val v:View):RecyclerView.ViewHolder(v)
class  RecyclerViewAdapter (val context:Context,private val caterogyClicked: CaterogyClicked):ListAdapter<Category,RecyclerViewHolder>(DIFF_UTIL){
    companion object{
        val DIFF_UTIL:DiffUtil.ItemCallback<Category> =
            object:DiffUtil.ItemCallback<Category>(){
                override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean =
                    newItem.name==oldItem.name


                override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean =
                    newItem.name==oldItem.name
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
       return RecyclerViewHolder( LayoutInflater.from(parent.context).inflate(R.layout.categoryitem,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        var name=getItem(position)
        holder.v.cart_name.text=name.name
        holder.itemView.setOnClickListener {
            caterogyClicked.caterogyClicked(name)


        }
    }


}