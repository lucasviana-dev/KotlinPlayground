package Test

fun main() {

    println("Declare a marca do veículo: ")
    val marca = readLine()

    println("Declare o ano do veículo: ")
    val ano = readLine()?.toIntOrNull()

    if(marca == null || ano == null) {
        println("ENTRADA INVÁLIDA! Favor declarar apenas o que foi pedido.")
    } else {
        val primeiroCarro = Carro(marca, ano)
        primeiroCarro.detalhes()
    }

}

class Carro(val marca: String, val ano: Int) {
    fun detalhes() {
        println("\nMeu carro é da marca $marca, fabricado no ano de $ano\n")
    }

}