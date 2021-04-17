package collections

fun main() {
    var map = HashMap<Long, String>()

    map.put(100200300400, "João")
    map.put(300400500600, "Maria")
    map.put(600700800900, "Pedro")

    map.put(600700800900, "Pedro Filho")

    for (par in map) {
        println(par)
    }

    for (nome in map.values) {
        println(nome)
    }

    for (cpf in map.keys) {
        println(cpf)
    }

    for ((cpf, nome) in map) {
        println("$nome (CPF: $cpf)")
    }

    map.size.print()
    map.get(300400500600)?.print()
    map[300400500600]?.print()
    map.contains(300400500600).print()
    map.remove(300400500600)?.print()
    map.clear()
    map.isEmpty().print()
}