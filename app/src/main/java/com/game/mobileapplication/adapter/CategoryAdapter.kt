package com.game.mobileapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.game.mobileapplication.R
import com.game.mobileapplication.model.Category

class CategoryAdapter(private val context: Context,
                      private val categories: ArrayList<Category>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var categoryTitle: TextView = itemView.findViewById<TextView>(R.id.categoryTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val categoryItems = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false)

        return CategoryViewHolder(categoryItems)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.categoryTitle.text = categories[position].getTitle()
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}