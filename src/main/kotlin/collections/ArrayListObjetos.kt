package collections

data class Fruta(var nome: String, var preco: Double)

fun main() {
    var frutas = arrayListOf(Fruta("Banana", 1.50), Fruta("Morango", 3.20))

    for (fruta in frutas) {
        println("${fruta.nome} - R$${fruta.preco}")
    }

    println(frutas.contains(Fruta("Banana", 1.50)))
}