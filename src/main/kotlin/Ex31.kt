package KotlinProjects

//Desafio 2: Saudação Inteligente
//Objetivo:
//Aproveite seu código anterior da saudação (com “bom dia”, “boa tarde”, etc.), mas torne o horário um parâmetro da função, para poder testar diferentes horários manualmente.
//Exemplo de uso esperado:
//val mensagem = saudacaoPersonalizada("Lucas", 9)
//Deve retornar "Bom dia, Lucas! ..."
//Dica:
//Você pode passar um Int representando a hora.
//Depois, é só usar when (hora) como antes.

fun main() {

    println("Favor inserir abaixo seu nome:")
    val name = readLine()

    if(name.isNullOrEmpty()) {
        println("Entrada INVÁLIDA! Por favor, insira apenas seu nome.")
        return
    } else {
        println("Insira também num modelo de 24 horas, o horário atual: ")
        val hour = readLine()?.toIntOrNull()

        if(hour == null) {
            println("ENTRADA INVÁLIDA! Digite apenas números inteiros.")
        } else {
            val saudacao = saudacaoPersonalizada(name, hour)
            println(saudacao)
        }
    }
}

fun saudacaoPersonalizada(name: String, hour: Int): String {
    val saudacao = when {
        hour < 0 -> "Horário inválido (menor que 0)"
        hour in 0..11 -> "Bom dia"
        hour in 12..17 -> "Boa tarde"
        hour in 18..23 -> "Boa noite"
        hour > 23 -> "Horário inválido (maior que 23)"
        else -> "Olá"
    }
    return "$saudacao, $name."
}

