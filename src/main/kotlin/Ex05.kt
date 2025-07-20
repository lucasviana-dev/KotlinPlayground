package Test

// Exercício 5: Números pares de 1 a 100
// Objetivo: Praticar for e if.
// Desafio:
// Mostre todos os números pares de 1 a 100.

fun main() {
    println("\nEsses são todos os números pares de 1 a 100\n")

    var contadorPares = 0

    for(contador in 1..100) {
        if(contador % 2 == 0) {
            println("$contador")
            contadorPares = contadorPares + 1
        }
    }

    println("\nQUANTIDADE DE NÚMEROS PARES ENTRE 1 E 100: $contadorPares\n")

}



