package oo.encapsulamento

private val dentroDoArquivo = 1

//protected val protegidoNaoSuportadoAqui = 1
internal val dentroDoProjeto = 1
public val publico = 1

private fun dentroDoArquivo() = 1

//protected fun protegidoNaoSuportadoAqui() = 1
internal fun dentroDoProjeto() = 1
public fun publico() = 1

open class Capsula { //open para a classe poder ser herdada
    private val dentroDoObjeto = 1
    protected val vaiPorHeranca = 1
    internal val dentroDoProjeto = 1
    val publico = 1

    private fun dentroDoObjeto() = 1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoProjeto() = 1
    fun publico() = 1
}

class CapsulaFilha : Capsula() {
    fun verificarAcesso() {
        println(vaiPorHeranca)
        println(dentroDoProjeto)
        println(publico)
    }
}

fun verificarAcesso() {
    println(Capsula().dentroDoProjeto())
    println(Capsula().publico())
}