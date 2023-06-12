class ABC
{
    var x:Int=0
    companion object{ var y:Int=0 }
}

fun main(args: Array<String>) {

    var a=ABC()
    a.x++
    var b=ABC()
    b.x++

    ABC.y++
    ABC.y++

    println(a.x)
    println(b.x)
    println(ABC.y)
}
