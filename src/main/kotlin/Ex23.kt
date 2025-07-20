package Test

//Exercício: Crie um programa que leia um número inteiro e diga se ele é:
//Par ou ímpar
//Positivo, negativo ou zero
//Múltiplo de 3 ou 5

fun main() {

    println("Declare um número inteiro qualquer:")
    val wholeNumber = readLine()?.toIntOrNull()

    if(wholeNumber == null) {
        println("NÚMERO INVÁLIDO! Favor inserir apenas números inteiros.")
    } else {
        if(wholeNumber % 2 == 0) {
            println("-> Número PAR")
        } else {
            println("-> Número ÍMPAR")
        }

        if(wholeNumber > 0) {
            println("-> NÚMERO POSITIVO")
        } else if (wholeNumber < 0) {
            println("-> Número NEGATIVO")
        } else {
            println("-> Número ZERO")
        }

        if (wholeNumber % 3 == 0) {
            println("-> Número MÚLTIPLO DE 3")
        }

        if (wholeNumber % 5 == 0) {
            println("-> Número MÚLTIPLO DE 5")
        }
    }
}