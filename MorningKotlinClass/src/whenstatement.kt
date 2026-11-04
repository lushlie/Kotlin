fun main() {

    //for many conditions

    var number = 2

    var dayofweek = when (number){

        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        else -> "Unknown"
    }

    println("Today is $dayofweek")


}