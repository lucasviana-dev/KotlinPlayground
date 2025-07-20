package Test

//Calculadora Simples com when
//Exercício: Faça um programa que leia dois números e uma operação (+, -, *, /) e mostre o resultado da operação usando when.

fun main() {

    println("Declare abaixo um número qualquer:")
    val numberOne = readLine()?.toDoubleOrNull()

    println("Declare abaixo outro número qualquer:")
    val numberTwo = readLine()?.toDoubleOrNull()

    if(numberOne == null || numberTwo == null) {
        println("Entrada INVÁLIDA! Favor inserir apenas números")
    } else {
        println("Escolha uma das operações abaixo para os valores declarados:")
        println("1 ➜ Soma (+)")
        println("2 ➜ Subtração (-)")
        println("3 ➜ Multiplicação (*)")
        println("4 ➜ Divisão (/)")
        val operacao = readLine()?.toIntOrNull()

        if(operacao == null || operacao > 4) {
            println("Entrada inválida! Digite um número entre 1 e 4.")
            return
        } else {
            when(operacao) {
                1 -> println("\nA soma entre $numberOne e $numberTwo é ${numberOne + numberTwo}\n")
                2 -> println("\nA subtração entre $numberOne e $numberTwo é ${numberOne - numberTwo}\n")
                3 -> println("\nA multiplicação entre $numberOne e $numberTwo é ${numberOne * numberTwo}\n")
                4 -> {
                    if(numberTwo != 0.0) {
                        println("\nA divisão entre $numberOne e $numberTwo é ${numberOne / numberTwo}\n")
                    } else {
                        println("Não é possível dividir por zero.")
                    }
                }
            }
        }
    }
}
