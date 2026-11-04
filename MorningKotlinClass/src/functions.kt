fun main() {
    //1.Standard library functions (already exists) e.g println
    var number = Math.sqrt(144.0)    //sqrt finds the square root (from kotlin math library)
    println(number)


    day()   //calling it out in no.2
    student("John",23,"Android")
    student("Mary", 23, "MIT")
}


//2.User-defined functions (created & defined by programmers) u make them
fun day(){
    println("Today is Wednesday")
}


fun student(name : String, age : Int, course : String){   //parameter(can put diff values under same variable)
    println("$name is $age. He is studying $course")
}