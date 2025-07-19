package Test

//Média de Notas com Listas
//Exercício: Solicite ao usuário que insira 5 notas (de 0 a 10), armazene em uma List<Double>, calcule a média e diga se o aluno foi:
//Aprovado (média >= 7)
//Em recuperação (média >= 5 e < 7)
//Reprovado (média < 5)

fun main() {

    val notas = mutableListOf<Double>()

    println("Para saber sua situacão de acordo com sua MÉDIA FINAL, insira abaixo suas cinco notas.")

    for(contador in 1..5) {
        while(true) {
            print("NOTA $contador: ")
            val score = readLine()?.toDoubleOrNull()

            if (score == null || score < 0 || score > 10) {
                println("NOTA INVÁLIDA! Declare um número entre 0 e 10.")
            } else {
                notas.add(score)
                break
            }
        }
    }

    val media = notas.average()

    println("\nNOTAS INFORMADAS: $notas")
    println("MÉDIA FINAL: %.2f".format(media))

    when {
        media >= 7 -> println("Aluno APROVADO!\n")
        media >=5 -> println("Aluno em RECUPERAÇÃO!\n")
        media < 5 -> println("Aluno em REPROVADO!\n")
    }
}