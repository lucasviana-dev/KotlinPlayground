package KotlinProjects

import Test.verificacaoPalindromo

//Nível 1 – Funções básicas
//Treina declaração, chamada e retorno de funções.
//1.Função que retorna a saudação personalizada:
//Use no main com seu nome.
//Modifique para mostrar a hora do dia (manhã, tarde, noite).

import java.time.LocalTime

fun main() {

    println("Favor inserir abaixo seu nome:")
    val name = readLine()

    if(name.isNullOrEmpty()) {
        println("Entrada INVÁLIDA! Por favor, insira apenas seu nome.")
        return
    } else {
        val saudacaoFinal = saudacao(name)
        println(saudacaoFinal)
    }
}

    fun saudacao(name: String): String {
        val horaAtual = LocalTime.now().hour

        val mensagem = when(horaAtual) {
            in 6..11 -> "Bom dia"
            in 12..17 -> "Boa tarde"
            else -> "Boa noite"
        }
        return("$mensagem, $name! Bem-vindo ao Kotlin!")
    }


