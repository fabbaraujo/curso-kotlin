package Lambdas

fun main() {
    val alunos = arrayListOf("Pedro", "Tiago", "Jonas")
    alunos.map { it.toUpperCase() }.apply { print(this) }
}