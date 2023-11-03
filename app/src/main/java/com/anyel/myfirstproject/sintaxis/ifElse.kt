package com.anyel.myfirstproject.sintaxis

fun main() {
        ifMultipleOR()
}

    fun ifMultipleAND() {
        var pet = "cat"
        var isHappy = true

        if (pet == "dog" && (pet == "cat" && isHappy)) {
            print("Es un gato o un perro")
        }
    }

    fun ifMultipleOR() {
        var pet = "cat"
        var isHappy = true

        if (pet == "dog" || (pet == "cat" && isHappy)) {
            print("Es un gato o un perro")
        }
    }

    fun ifElseIf() {
        var age = 18

        if (age >= 18) {
            println("Beber cerveza")
        } else if (age >= 16) {
            println("Beber jugo")
        } else {
            println("No puedes beber")
        }
    }

    fun ifElse() {
        var age = 18

        if (age >= 18) {
            println("Beber cerveza")
        } else {
            println("No puedes beber")
        }
    }



    fun ifAnidado() {
        val animal = "Aris"

        if (animal == "dog") {
            println("Es un perrito!")
        } else if (animal == "cat") {
            println("Es un gato")
        } else if (animal == "bird") {
            println("Es un pajaro")
        } else {
            println("No es uno de los animales esperados")
        }


    }

    fun ifBasico() {
        val name = "Aris"

        if (name == "Aris") {
            println("Oye, la variable name es ARIS")
        } else {
            println("Este no es Aris")
        }
    }

