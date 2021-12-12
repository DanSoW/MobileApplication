package com.game.mobileapplication.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.game.mobileapplication.R
import com.game.mobileapplication.model.Course

class CourseAdapter(private val context: Context,
                    private val courses: ArrayList<Course>):
    RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {

    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var courseBg: LinearLayout = itemView.findViewById<LinearLayout>(R.id.courseBg)
        var courseImage: ImageView = itemView.findViewById<ImageView>(R.id.courseImage)
        var courseTitle: TextView = itemView.findViewById<TextView>(R.id.courseTitle)
        var courseDate: TextView = itemView.findViewById<TextView>(R.id.courseDate)
        var courseLevel: TextView = itemView.findViewById<TextView>(R.id.courseLevel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        var courseItems = LayoutInflater.from(context).inflate(R.layout.course_item, parent, false)

        return CourseAdapter.CourseViewHolder(courseItems)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.courseTitle.text = courses[position].title
        holder.courseBg.setBackgroundColor(Color.parseColor(courses[position].color))
        holder.courseDate.text = courses[position].date
        holder.courseLevel.text = courses[position].level
        holder.courseImage.setImageResource(context.resources.getIdentifier("ic_" + courses[position].img,
            "drawable", context.packageName))
    }

    override fun getItemCount(): Int {
        return courses.size
    }
}