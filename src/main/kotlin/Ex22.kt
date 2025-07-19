package Test

//EX28 Ler 10 valores, calcular e escrever a média aritmética desses valores.

fun main() {

    var soma = 0.0
    var contador = 1

    println("Indique abaixo DEZ valores quaisquer.")

    while (contador <= 10) {
        println("Digite o ${contador}º valor: ")
        val number = readLine()?.toDoubleOrNull()

        if(number == null) {
            println("ENTRADA INVÁLIDA! Digite um número válido.")
        } else {
            soma = soma + number
            contador++
        }
    }
    val mediaArithmetic = soma / 10
    println("\nA soma dos valores é igual a $soma")
    println ("A média aritmética é %.2f\n".format(mediaArithmetic))
}