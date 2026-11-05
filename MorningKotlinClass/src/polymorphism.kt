//same method diff actions
open class Shape{
    open fun draw(){
        println("Drawing a shape")
    }
}

class Rectangle:Shape(){
    override fun draw(){
        println("Drawing a rectangle")
    }
}

class Circle:Shape(){
    override fun draw(){
        println("Drawing a circle")
    }
}

fun main() {
    var rect = Rectangle()
    rect.draw()

    var cir = Circle()
    cir.draw()
}
