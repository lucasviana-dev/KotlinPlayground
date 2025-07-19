package Test

// Objetivo: Praticar variáveis, leitura e impressão.
// Desafio:
// Peça ao usuário que informe seu nome, idade e cidade. Depois, imprima uma mensagem de apresentação.

fun main () {

    print ("Informe seu nome: ")
    val name = readLine()

    print ("Informe sua idade: ")
    val ageInput = readLine()
    val age = ageInput?.filter { it.isDigit() }?.toIntOrNull()

    print ("Em qual cidade você mora? ")
    val city = readLine()

    if (name != null && age != null && city != null) {
        println ("Olá $name, agora sei que você tem $age anos e mora em $city. Seja bem vindo ao Kotlin!")
    } else {
        println ("Dados incompletos. Por favor, preencha todas as informações corretamente.")
    }

}
