package Test

//Contador de Vogais
//Exercício: Escreva uma função que receba uma string e retorne quantas vogais existem nela.

fun main() {

    println("Para saber a quantidade de vogais existentes, declare abaixo uma frase ou palavra qualquer.")
    val textoInformado = readLine()

    if(textoInformado.isNullOrEmpty()) {
        println("Entrada INVÁLIDA! Por favor, digite apenas uma frase ou palavra.")
    } else {
        val qtdVogais = contadorVogais(textoInformado)
        println("\nTexto informado: $textoInformado")
        println("Quantidade de vogais: $qtdVogais\n")
    }
}

fun contadorVogais(texto: String): Int {
    val vogais = listOf('a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú')
    return texto.count { it.lowercaseChar() in vogais }
}