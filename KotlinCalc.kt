package demo
import java.util.Scanner

fun main(args: Array<String>){
    println()
    println("Kotlin Basic Calculator")
    println("For Addition, Subtraction, Multiplication, Division")
    println("With Repeat Statement (More info see source code)")
    println("---------------------------------------------------")

    println("Please choose the operation!")
    println("1 for Addition")
    println("2 for Subtraction")
    println("3 for Multiply")
    println("4 for Divide")
    println()
    operation()
}

fun operation() {
    println()
    print("Enter operation: ")
    val operator = readLine()
    val intInput = Scanner(System.`in`)

    if (operator == "1"){

        print("Enter first number: ")
        val num1 : Int = intInput.nextInt()
        print("Enter second number: ")
        val num2 : Int = intInput.nextInt()
        val equals = (num1 + num2)
        println("Result is: "+equals)
        println()

    }
    else if (operator == "2"){

        print("Enter first number: ")
        val num1 : Int = intInput.nextInt()
        print("Enter second number: ")
        val num2 : Int = intInput.nextInt()
        val equals = (num1 - num2)
        println("Result is: "+equals)
        println()

    }
    else if (operator == "3"){

        print("Enter first number: ")
        val num1 : Int = intInput.nextInt()
        print("Enter second number: ")
        val num2 : Int = intInput.nextInt()
        val equals = (num1 * num2)
        println("Result is: "+equals)
        println()

    }
    else if (operator == "4"){

        print("Enter first number: ")
        val num1 : Int = intInput.nextInt()
        print("Enter second number: ")
        val num2 : Int = intInput.nextInt()
        val equals = (num1 / num2)
        println("Result is: "+equals)
        println()

    }
    else{

        println("Invalid, please try again!")
        operation()
    }

    repeating()

}

fun repeating(){
    println()
    println("Do you want to try again?")
    print("Input [Y/N]: ")
    val repeat = readLine()

    if (repeat == "Y"){
        operation()
    }
    else if (repeat == "N"){
        println("Thank you for using this program!")
    }
    else{
        println("Invalid, try again!")
        repeating()
    }
}