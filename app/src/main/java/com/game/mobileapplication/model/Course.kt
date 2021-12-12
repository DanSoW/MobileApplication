package com.game.mobileapplication.model

class Course {
    var id: Int = (-1)
    var img: String = ""
    var title: String = ""
    var date: String = ""
    var level: String = ""
    var color: String = ""

    constructor(id: Int, img: String, title: String, date: String, level: String, color: String) {
        this.id = id
        this.img = img
        this.title = title
        this.date = date
        this.level = level
        this.color = color
    }
}