fun main() {

  //1.while loop
    var num = 20  //set first value

    while (num <= 25){  //condition
        println("number is $num")
        num ++ //increasing (-- decreasing)
    }

//2.do...while loop
   var number = 20

    do{    //starts loop
        println(number)  //prints current no.
        number++   //increases
    }while (number <=25)   //if true loop repeats

    //3.for loop
    for (x in 20 .. 25){  //(.. -means to)
        println("no $x")
    }

    //break and continue
//break (stops before value)
    for (i in 20..30){
        if (i == 25){
            break
        }
    println(i)}

    //continue (skip value)
    for(b in 20..26){
        if (b ==25){
            continue
    }
        println(b)}



}