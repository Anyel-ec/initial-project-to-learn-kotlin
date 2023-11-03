package com.anyel.myfirstproject.sintaxis
// Project by Anyel - EC
// comments in one line
/**
 * Variables
 */
fun main(){
    /**
     * numerical variables
     * */
    // variables integer: int
    val age:Int= 30
    var age2:Int= 30
    age2 = 29
    println("Sum: ")
    println(age + age2)
    println("Restart: ")
    println(age - age2)
    println("Multiply: ")
    println(age * age2)
    println("Split: ")
    println(age / age2)
    println("Module: ")
    println(age % age2)
    // large variables: long
    val example:Long = 30

    // Float
    val floatExample:Float = 30.5f

    // Double it is bigger than the float
    val doubleExample:Double = 3000.0000
// crear variable nombre que sea igual a Angel
    val name:String = "Angel"
    /**
     * variables Alfanumericas
     *
     * */
    // Char -a charater
    val charExample1:Char = 'a'
    val charExample2:Char = '2'
    val charExample3:Char = '@'
    // String
    val stringExample:String = "Hello, is my first project in kotlin"
    /**
     * Variables boolean
     * */

    // Boolean

    val booleanExample1:Boolean = true
    val booleanExample2:Boolean = false
    val myName = "Anyel"
    println(stringExample)

    var stringConcatenar:String = "Hola me llamo $myName"
    println(stringConcatenar)
}
