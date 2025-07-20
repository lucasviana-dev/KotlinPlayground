package Test

fun main() {

    print("Digite neste campo sua primeira nota (de preferência utilize '.' ao invés de ','): ")
    val score = readLine()?.toDoubleOrNull()

    print("Digite neste campo sua segunda nota (de preferência utilize '.' ao invés de ','): ")
    val score2 = readLine()?.toDoubleOrNull()

    if(score == null || score2 == null) {
        println ("ENTRADA INVÁLIDA")
    } else {
        val mediaFinal = (score + score2) / 2
        println("Sua média é %.2f".format(mediaFinal))
        if(mediaFinal >= 7) {
            println ("PARABÉNS, VOCÊ FOI APROVADO!")
        } else {
            println("VOCÊ FOI REPROVADO!")
        }
    }

}
