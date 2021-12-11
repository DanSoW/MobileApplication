package com.game.mobileapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.game.mobileapplication.adapter.CategoryAdapter
import com.game.mobileapplication.model.Category

class MainActivity : AppCompatActivity() {
    var categoryRecycler: RecyclerView? = null
    var categoryAdapter: CategoryAdapter? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var categoryList: ArrayList<Category> = arrayListOf()
        categoryList.add(Category(1, "Игры"))
        categoryList.add(Category(2, "Сайты"))
        categoryList.add(Category(3, "Языки"))
        categoryList.add(Category(4, "Прочее"))

        setCategoryRecycler(categoryList)
    }

    private fun setCategoryRecycler(categoryList: ArrayList<Category>) {
        var layoutManager: RecyclerView.LayoutManager
            = LinearLayoutManager(this,
                RecyclerView.HORIZONTAL,
                false
            )

        categoryRecycler = findViewById(R.id.categoryRecycler)
        categoryRecycler?.layoutManager = layoutManager

        categoryAdapter = CategoryAdapter(this, categoryList)
        categoryRecycler?.adapter = categoryAdapter
    }
}