package Test

//Simulador de Caixa Eletrônico
//Exercício: Peça um valor de saque (entre R$10 e R$600) e mostre quantas notas de R$100, R$50, R$10, R$5 e R$1 serão entregues.

fun main() {

    println("Indique abaixo o valor que deseja sacar: ")
    val saque = readLine()?.toIntOrNull()

    if(saque == null || saque < 10 || saque > 600) {
        println("VALOR INVÁLIDO! Declare apenas valores inteiros entre $10,00 e $600,00")
        return
    }

    var restante = saque

    val notas100 = restante / 100
    restante %= 100

    val notas50 = restante / 50
    restante %= 50

    val notas10 = restante / 10
    restante %= 10

    val notas5 = restante / 5
    restante %= 5

    val notas1 = restante / 1
    restante %= 1

    println("VOCÊ RECEBERÁ:")

    if(notas100 > 0) println("$notas100 nota(s) de cem reais.")
    if(notas50 > 0) println("$notas50 nota(s) de cinquenta reais.")
    if(notas10 > 0) println("$notas10 nota(s) de dez reais.")
    if(notas5 > 0) println("$notas5 nota(s) de cinco reais.")
    if(notas1 > 0) println("$notas1 nota(s) de um real.")
}