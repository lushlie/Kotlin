//class - sketch or blueprint of object
class Dog(var color : String, var age : Int, var breed : String ){  //parameter


    fun bark(){      //behaviour
        println("Woof! woof")
    }
    fun tail(){
        println("Dog wagging tail")
    }
}

//object or final - instance of a class
fun main() {

    var dog1 = Dog("black", 2, "Siberian Husky")
    println(dog1.breed)
    println(dog1.color)


    var dog2 = Dog("brown", 1, "Chihuahua")
}