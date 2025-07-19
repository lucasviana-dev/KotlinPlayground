package Test

fun main() {

    println("Para calcular seu IMC, declare abaixo as seguintes informações: ")

    print("Digite a sua massa (KG): ")
    val mass = readLine()?.toDoubleOrNull()

    print("Digite a sua altura (M): ")
    val height = readLine()?.toDoubleOrNull()

    if(mass == null || height == null) {
        println("ENTRADA INVÁLIDA! Certifique-se de digitar números válidos para massa e altura.")
    } else {
        val calculator = ImcCalculator(mass, height)
        calculator.calculateTotal()

    }

}

class ImcCalculator(val mass: Double, val height: Double) {
    fun calculateTotal() {
        val imc = mass / (height * height)
        println("Seu IMC é %.2f".format(imc))

        when {
            imc < 17 -> println("Muito abaixo do peso ideal.")
            imc >= 17 && imc < 18.5 -> println("Abaixo do peso ideal.")
            imc >= 18.5 && imc < 25 -> println("Peso ideal.")
            imc >= 25 && imc < 30 -> println("Sobrepeso.")
            imc >= 30 && imc < 35 -> println("Obesidade")
            imc >= 35 && imc < 40 -> println("Obesidade severa.")
            imc > 40 -> println("Obesidade mórbida.")
        }
    }
}



