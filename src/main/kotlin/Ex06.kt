package Test

// Ex anterior com interação

fun main () {

    println ("Declare abaixo dois valores inteiros.")

    print ("Primeiro valor: ")
    val valor1 = readLine()?.toIntOrNull()

    print ("Segundo valor: ")
    val valor2 = readLine()?.toIntOrNull()

    if (valor1 != null && valor2 != null) {

        val menor = minOf(valor1, valor2)
        val maior = maxOf(valor1, valor2)

        println("\nEsses são todos os números pares entre $valor1 e $valor2\n")

        var contadorPares = 0

        for (contador in menor..maior) {
            if (contador % 2 == 0) {
                println("$contador")
                contadorPares = contadorPares + 1
            }
        }

        println("\nQUANTIDADE DE NÚMEROS PARES ENTRE $valor1 E $valor2: $contadorPares\n")
    } else {
        println("ENTRADA INVÁLIDA! Por favor, insira apenas números inteiros.")
    }

}