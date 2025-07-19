package Test

fun main() {

    println("Quantos gols fez o time convidado: ")
    val golsConvidado = readLine()?.toIntOrNull()

    println("Quantos gols fez o time da casa: ")
    val golsCasa = readLine()?.toIntOrNull()

    if(golsCasa == null || golsConvidado == null || golsCasa < 0 || golsConvidado < 0) {
        println("ENTRADA INVÁLIDA! Favor inserir apenas números inteiros positivos.")
    } else {
        val menor = minOf(golsConvidado, golsCasa)
        val maior = maxOf(golsConvidado, golsCasa)
        val diferencaGols = maior - menor

        //Poderia ser usado também ao invés do trecho acima
        //val diferencaGols = kotlin.math.abs(golsCasa - golsConvidado)

        println("\nDIFERENÇA DE GOLS: $diferencaGols")

        when {
            diferencaGols == 0 -> println("EMPATE")
            diferencaGols in 1..3 -> println("PARTIDA NORMAL")
            diferencaGols > 3 -> println("GOLEADA")
        }

        val timeVencedor = when {
                golsCasa > golsConvidado -> "Time da casa venceu!\n"
                golsConvidado > golsCasa -> "Time convidado venceu!\n"
                else -> "Não houve vencedor.\n"
            }
        println(timeVencedor)
    }
}