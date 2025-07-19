package Test

// Exercício 4: Tabuada
// Objetivo: Praticar laço for.
// Desafio:
// Peça um número e mostre sua tabuada de 1 a 10.
// Saída esperada:
// Digite um número: 7
// 7 x 1 = 7
// 7 x 2 = 14
// ...
// 7 x 10 = 70

fun main () {
    print ("Qual número você gostaria que fosse apresentado em forma de tabuada? ")
    val number = readLine()?.toIntOrNull()

    if (number != null) {
        println("\nTabuada do número $number\n")
        for (contador in 1..10) {
            println("$number X $contador = ${number * contador}")
        }
    } else {
        println ("Entrada inválida!")
    }

}
