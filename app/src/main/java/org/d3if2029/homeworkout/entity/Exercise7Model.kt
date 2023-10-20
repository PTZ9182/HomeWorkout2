package org.d3if2029.homeworkout.entity

class Exercise7Model(private var id : Int,
                     private var name : String,
                     private var image : Int,
                     private var desk : String,
                     private var videoUrl: String,
                     private var isCompleted : Boolean,
                     private var isSelected : Boolean) {

    fun getId() : Int {
        return id
    }

    fun setId(id: Int){
        this.id = id
    }

    fun getName() : String {
        return name
    }

    fun setName(name: String){
        this.id = id
    }

    fun getImage() : Int {
        return image
    }

    fun setImage(image : Int){
        this.image = image
    }

    fun getDesk() : String {
        return desk
    }

    fun getVideoUrl() : String{
        return videoUrl
    }

    fun getIsCompleted() : Boolean {
        return isCompleted
    }

    fun setIsCompleted(isCompleted: Boolean){
        this.isCompleted = isCompleted
    }

    fun getIsSelected() : Boolean {
        return isSelected
    }

    fun setIsSelected(isSelected: Boolean){
        this.isSelected = isSelected
    }

}