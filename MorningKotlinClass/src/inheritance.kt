//open to make it public to get what the class has
open class Animal{  //parent or super or base
    var isMammal = true  //boolean
    var color = "white"  //string

    fun eat(){
        println("Animal is eating...")
    }
}

open class Cow : Animal(){  //child or sub or derived
    fun sound(){
       println("Moow! moow")
    }
}

class Sheep : Cow(){
    fun bleet(){
        println("Mee! meee")
    }
}

fun main() {

    var mycow = Cow()
    mycow.sound()
    var mysheep = Sheep()
    mysheep.bleet()
}