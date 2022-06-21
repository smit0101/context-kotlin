fun main(){

   invoke("smit")
    sss(s)
    with("raj"){
        invoke(this)
    }
    say()
}


val s:()->Unit = {}

fun sss(value:suspend ()->Unit){

}

val invoke:context(String) ()->Unit = {}

fun <T> T.vapro(block:T.()->Unit): T {
    block()
   return this
}

context(Test)
val vv:Int get()=10

context(Test, B)
fun Int.hey(){
        println(this@Test::class)
        println(this@Test === this@B)
        println(this@Int)
}
open class Test(val id:Int = 100)

class B:Test()




context(Test,B)
open class Sike{
    init{
        println("one")
    }
}

fun say() {
 with(B()) {
     class Vike : Sike(){
                init {
                    println("two")
                    8.vapro {  }
                }
     }
     Vike()
 }
}


open class A
open class Bb:A()

context (A, Int)
open class Tt()

context (A, Int)
open class Vt():Tt()


class Try{


    companion object{
        fun hey()=println()
    }
}

fun vay(){
    println(
    Try.Companion
    )

    Try()
}


