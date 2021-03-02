/*
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

    fun overloard(i: Int) = println("Overload")
    fun overloard(i: Int, b:Int) = println("Overload")
    fun overloard(i: Int, b:Int, java : String) = println("Overload")
}

 */
class Constants private constructor(){

    companion object{
        val TABLE = "Pessoa"

        fun teste(){
            println("sou um metodo estático")
        }
    }
    object VENDAS{
        val TABLE_NAME = "Vendas"

        object COLUNAS{
            val ID ="ID"
            val TOTAL = "TOTAL"
        }
    }


}

fun main() {
    println(Constants.TABLE)
    Constants.teste()
    Constants.VENDAS.COLUNAS.ID


/*
val c:Computador = Computador("xpto", 8)
with(c){
    ligar()
    processar()
    minhaMarca()
}

 */

}