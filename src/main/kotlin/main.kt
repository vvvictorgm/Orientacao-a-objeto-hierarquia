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

/*
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

 */

//mamire - animal

abstract class Mamifero ( var nome: String){
    abstract fun falar()
    open fun dormir(){
        println("Estou dormindo")
    }
}

class Cachorro (nome: String):Mamifero(nome){
    override fun falar() {
        println("au au porra")
    }

}

class Animal (nome: String):Mamifero(nome){
    override fun falar() {
        println("miau porra")
    }

    override fun dormir() {
        println("dormir por 15 horas")
    }

}

fun main() {

    Cachorro("Bolt").dormir()



    /*
    println(Constants.TABLE)
    Constants.teste()
    Constants.VENDAS.COLUNAS.ID


     */

/*
val c:Computador = Computador("xpto", 8)
with(c){
    ligar()
    processar()
    minhaMarca()
}

 */

}