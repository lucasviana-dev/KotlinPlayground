package Test

fun main () {

    println ("Para saber sua idade atual, digite abaixo os seguintes dados:")

    print ("Em que ano nós estamos? ")
    val year = readLine()?.toIntOrNull()

    print ("Em que ano você nasceu? ")
    val birthYear = readLine()?.toIntOrNull()

    if (year == null || birthYear == null) {
        println("ENTRADA INVÁLIDA! Digite apenas números inteiros.")
        return
    }

    val age = year - birthYear

    if (age < 0) {
        println ("Ano de nascimento INVÁLIDO! Você ainda não nasceu?")
    } else {
        println ("Sua idade atual é $age anos.")
        if (age >= 18) {
            println ("Neste caso você já está APTO a tirar a Carteira Nacional de Habilitacão.\n")
        } else {
            println ("INAPTO A TIRAR A CARTEIRA NACIONAL DE HABILITACÃO!\n")
        }
    }

}