package Test

// Exercício 2: Verificador de maioridade
// Objetivo: Praticar leitura de dados e uso do if.
// Desafio:
// Peça a idade do usuário e diga se ele é maior ou menor de idade.

fun main() {
    println("Digite abaixo sua idade: ")
    val ageInput = readLine()?.toIntOrNull()

    if(ageInput != null) {
        if(ageInput >= 18) {
            println("Parabéns, você já atingiu a maioridade!")
        } else {
            println("MENOR DE IDADE")
        }

    } else {
        println("Idade inválida. Por favor, digite um número.")
    }

}