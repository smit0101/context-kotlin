
fun main(){
    val s = Circle()
    val v = Circle()
    val d:Shape = Circle()
    with(d) {
        with(v) {
            s.hey()
        }
    }
}

open class Shape
class Circle:Shape()

context(Shape, raj@ Circle)
        fun  Circle.hey(){
            println(this)
            println(this@hey)
            println(this@Circle)
            println(this@raj)
            println(this@Shape)


        }