package Test

// Ex anterior porém com números reais

fun main() {

    println("Para saber o resultado das operações matemáticas básicas entre dois valores, digite abaixo: ")

    print("Um número qualquer: ")
    val numberInput = readLine()?.toDoubleOrNull()

    print("Outro número qualquer: ")
    val numberTwoInput = readLine()?.toDoubleOrNull()

    if(numberInput == null || numberTwoInput == null) {
        println("Entrada inválida! Certifique-se de digitar apenas números.")
        return
    }

    val sum = numberInput + numberTwoInput
    val subtraction = numberInput - numberTwoInput
    val multiplication = numberInput * numberTwoInput
    val division = if (numberTwoInput != 0.0) numberInput / numberTwoInput else null

    println("A soma de $numberInput mais $numberTwoInput é igual a $sum")
    println("A subtração de $numberInput menos $numberTwoInput é igual a $subtraction")
    println("A multiplicação de $numberInput vezes $numberTwoInput é igual a $multiplication")

    if(division != null) {
        println("A divisão de $numberInput por $numberTwoInput é igual a $division")
    } else {
        println("Não é possível dividir por zero.")
    }

}