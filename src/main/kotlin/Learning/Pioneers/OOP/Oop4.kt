open class A
{
    private fun sum(x:Int, y:Int)
    {
        println(x+y)
    }
    fun div(x:Int,y:Int)
    {
        println(x/y)
    }
}
class B:A()
{
    fun show()
    {
        println("Welcome")
    }
}
fun main(args: Array<String>) {
    var obj=B()
    obj.show()
    obj.div(8,2)
}