package collections

class Objeto(val nome: String, val descricao: String) {
    override fun hashCode(): Int {
        return nome.length
    }

    override fun equals(other: Any?) = if (other is Objeto) {
        nome.equals(other.nome, ignoreCase = true)
    } else {
        false
    }

}

fun main() {
    val conjunto = hashSetOf(
        Objeto("Cadeira", "..."), //hashcode = 7
        Objeto("Mesa", "..."), //hashcode = 4
        Objeto("Faca", "..."), //hashcode = 4
        Objeto("Copo", "..."), //hashcode = 4
    )

    conjunto.contains(Objeto("faca", "???")).print()
}