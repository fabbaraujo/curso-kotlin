package collections

fun main() {
    val map = hashMapOf(1 to "Gui", 2 to "Rebeca", 3 to "Bruno")

    for ((id, nome) in map) {
        println("$id) $nome")
    }
}