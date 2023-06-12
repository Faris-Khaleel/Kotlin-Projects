open class X
{
    open fun show()
    {
        println("Hello")
    }
}
class Y:X()
{
    override fun show()
    {
        super.show()
        println("Welcome")
    }
}
fun main(args: Array<String>) {
    var obj=Y()
    obj.show()
}