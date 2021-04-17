package Lambdas

fun main() {
    val listaComNulos: List<String?> = listOf("A", null, "B", null, "C")

    for (item in listaComNulos) {
        item?.let { println(it) }
    }
}