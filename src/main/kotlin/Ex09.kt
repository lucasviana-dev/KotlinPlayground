package Test

fun main() {
    println("Para saber se um número é PAR ou ÍMPAR declare abaixo o valor desejado:")
    print("Digite um número qualquer: ")
    val number = readLine()?.toIntOrNull()

    if(number == null) {
        println("VALOR INVÁLIDO! DIGITE APENAS NÚMEROS INTEIROS.")
    } else {
        if(number % 2 == 0) {
            println("O número $number é PAR")
        } else {
            println("O número $number é ÍMPAR")
        }
    }
}
