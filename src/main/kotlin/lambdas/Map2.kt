package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto("A", 21.90),
    Produto("B", 11.90),
    Produto("C", 0.70),
    Produto("D", 1.80),
)

fun main() {
    val totalizar = { total: Double, atual: Double -> total + atual }
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)

    println("O preço médio é R$${precoTotal / materialEscolar.size}.")
}