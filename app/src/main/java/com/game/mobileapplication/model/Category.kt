package com.game.mobileapplication.model

class Category {
    private var id: Int = (-1)
    private var title: String = ""

    constructor(id: Int, title: String) {
        this.id = id
        this.title = title
    }

    public fun getId(): Int{
        return id
    }

    public fun setId(id: Int){
        this.id = id
    }

    public fun getTitle(): String{
        return title
    }

    public fun setTitle(title: String){
        this.title = title
    }
}