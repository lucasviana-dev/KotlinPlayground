package Test

//EX22 Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que N será sempre maior que ZERO

fun main() {

    println("Digite um número inteiro qualquer (MAIOR QUE ZERO): ")
    val number = readLine()?.toIntOrNull()

    if(number == null || number <= 0) {
        println("ENTRADA INVÁLIDA! Favor inserir apenas números inteiros maiores que zero!")
    } else {
        println("Os valores inteiros entre 1 e $number são: ")
                for(contador in 1..number) {
                    println(contador)
        }
    }
}