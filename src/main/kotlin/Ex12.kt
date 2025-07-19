package Test

fun main () {

    println ("Para calcular seu IMC, declare abaixo as seguintes informações: ")

    print ("Digite a sua massa (KG): ")
    val mass = readLine()?.toDoubleOrNull()

    print ("Digite a sua altura (M): ")
    val height = readLine()?.toDoubleOrNull()

    if (mass == null || height == null) {
        println ("ENTRADA INVÁLIDA! Certifique-se de digitar números válidos para massa e altura.")
    } else {
        val imc = mass / (height * height)
        println ("Seu IMC é %.2f".format(imc))
        if (imc >= 18.5 && imc < 25) {
            println ("Parabéns, você está no seu peso ideal.")
        } else {
            println ("Você não está na faixa de peso ideal.")
        }
    }

}