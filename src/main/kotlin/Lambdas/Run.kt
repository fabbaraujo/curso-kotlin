package Lambdas

data class Casa(var endereco: String = "", var num: Int = 0)

fun main() {
    var casa = Casa()

    casa.run {
        endereco = "Rua ABC"
        num = 1544
    }

    println(casa)
}