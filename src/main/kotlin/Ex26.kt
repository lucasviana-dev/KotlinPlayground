package Test

//Verificador de Palíndromo
//Exercício: Crie uma função que verifique se uma palavra ou frase é um palíndromo (ignorar espaços e letras maiúsculas).

fun main() {

    println("Para fazer uma verificação de palíndromo, declare abaixo uma frase ou palavra qualquer.")
    val textoInformado = readLine()

    if(textoInformado.isNullOrEmpty()) {
        println("Entrada INVÁLIDA! Por favor, digite apenas uma frase ou palavra.")
        return
    } else {
        val resultado = verificacaoPalindromo(textoInformado)

        if(resultado) {
            println("\nO texto informado foi: $textoInformado")
            println("-> É UM PALÍNDROMO\n")
        } else {
            println("\nO texto informado foi: $textoInformado")
            println("-> NÃO É UM PALÍNDROMO\n")
        }
    }
}

//Função que verifica se é palíndromo
fun verificacaoPalindromo(texto: String): Boolean {
    val textoTratado = texto.lowercase().replace(" ", "")
    val textoInvertido = textoTratado.reversed()
    return textoTratado == textoInvertido
}