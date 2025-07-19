package Test

fun main() {

    val carro1 = Carro("Ford", 1988)
    carro1.detalhes()

}

class CarroTeste(val marca: String, val ano: Int) {
    fun detalhes() {
        println("Meu carro é da marca $marca, fabricado no ano de $ano")
    }

}