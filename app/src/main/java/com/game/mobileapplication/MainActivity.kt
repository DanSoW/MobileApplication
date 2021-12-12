package com.game.mobileapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.game.mobileapplication.adapter.CategoryAdapter
import com.game.mobileapplication.adapter.CourseAdapter
import com.game.mobileapplication.model.Category
import com.game.mobileapplication.model.Course

class MainActivity : AppCompatActivity() {
    private var categoryRecycler: RecyclerView? = null
    private var categoryAdapter: CategoryAdapter? = null

    private var coursesRecycler: RecyclerView? = null
    private var coursesAdapter: CourseAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categoryList: ArrayList<Category> = arrayListOf()
        categoryList.add(Category(1, "Игры"))
        categoryList.add(Category(2, "Сайты"))
        categoryList.add(Category(3, "Языки"))
        categoryList.add(Category(4, "Прочее"))

        setCategoryRecycler(categoryList)

        val courseList: ArrayList<Course> = arrayListOf()
        courseList.add(Course(1, "course_java", "Профессия Java разработчик",
            "1 января", "начальный", "#424345"))
        courseList.add(Course(2, "course_python", "Профессия Python разработчик",
            "1 декабря", "средний", "#9FA52D"))

        setCourseRecycler(courseList)
    }

    private fun setCourseRecycler(courseList: ArrayList<Course>) {
        val layoutManager: RecyclerView.LayoutManager
            = LinearLayoutManager(this,
                RecyclerView.HORIZONTAL,
                false
            )

        coursesRecycler = findViewById(R.id.courseRecycler)
        coursesRecycler?.layoutManager = layoutManager

        coursesAdapter = CourseAdapter(this, courseList)
        coursesRecycler?.adapter = coursesAdapter
    }

    private fun setCategoryRecycler(categoryList: ArrayList<Category>) {
        val layoutManager: RecyclerView.LayoutManager
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