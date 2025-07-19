package Test

//EX27 Ler 10 valores e escrever quantos desses valores lidos estão no intervalo [10,20] (incluindo os valores 10 e 20 no intervalo) e quantos deles estão fora desse intervalo.

fun main() {

    var dentroDoIntervalo = 0
    var foraDoIntervalo = 0

    println("Indique abaixo DEZ valores quaisquer.")

    for (contador in 1..10) {
        println("Digite um valor qualquer: ")
        val number = readLine()?.toDoubleOrNull()

        if(number == null) {
            println("ENTRADA INVÁLIDA!")
        } else {
            if(number >= 10 && number <= 20) {
                dentroDoIntervalo++
            } else {
                foraDoIntervalo++
            }
        }
    }
    println("\n$dentroDoIntervalo valores estão no intervalo de 10 a 20")
    println("$foraDoIntervalo valores estão fora do intervalo de 10 a 20\n")
}