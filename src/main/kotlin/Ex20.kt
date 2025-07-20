package Test

//EX26 Ler 10 valores e escrever quantos desses valores lidos são negativos.

fun main() {

    println("Indique abaixo DEZ valores quaisquer.")

    var negativeNumbers = 0

    for(contador in 1..10) {
        println("Digite um valor qualquer: ")
        val number = readLine()?.toDoubleOrNull()

        if(number == null) {
            println("ENTRADA INVÁLIDA!")
        } else {
            if(number < 0) {
                negativeNumbers++
            }
        }
    }
    println ("\nQuantidade de valores negativos: $negativeNumbers\n")
}