open class Maquina(val marca: String) {
    open fun minhaMarca() {
        println("Minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos: Int) : Maquina(marca) {
    override fun minhaMarca() {
        "estou reencreendo minhaMarca"
    }
    fun ligar(){}
    fun processar(){}
}

fun main() {
    val c:Computador = Computador("xpto", 8)
    with(c){
        ligar()
        processar()
        minhaMarca()
    }

}