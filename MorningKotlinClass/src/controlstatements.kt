fun main() {

    var first = 21
    var second = 67
    var third = 78

    if (first > second && first > third){
        println("$first is largest")
    }

    else if (second > first && second > third){
        println("$second is largest")
    }

    else{
        println("$third is largest")
    }

}