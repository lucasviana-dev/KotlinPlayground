package Test

//Validador de Nome
//Objetivo:
//Crie uma função que valide se um nome digitado é válido. O nome só pode conter letras (inclusive acentuadas) e espaços.
//Regras:
//Não pode ter números nem símbolos.
//Não pode ser vazio ou só espaços.
//A função deve retornar true ou false.
//Dica:
//Use Regex.
//Use .matches(...) para comparar o padrão.

fun main() {

    println("Favor inserir abaixo seu nome:")
    val name = readLine()

    if(name.isNullOrBlank()) {
        println("Entrada INVÁLIDA! Por favor, insira apenas seu nome.")
        return
    } else if(validacao(name)) {
        println("NOME VÁLIDO")
    } else {
        println("NOME INVÁLIDO! Use apenas letras e espaços.")
    }
}

fun validacao(name: String): Boolean {
    val regex = Regex("^[A-Za-zÀ-ÿ ]+\$")
    return name.matches(regex)
}