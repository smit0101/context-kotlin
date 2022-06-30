import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        GlobalScope.launch{
            runBlocking {
                println(Thread.currentThread().name)
            }
        }
        println("K"+Thread.currentThread().name)
    }
}