class Studentp
{
    var name:String=""
    var address:String=""

    fun display()
    {
        println(name)
        println(address)
    }

    fun display(n:String,a:String)
    {
        println(n)
        println(a)
    }
}
fun main(args: Array<String>) {

    var s=Studentp()
    s.name = "Ibrahim"
    s.address="Amman"
    s.display()
    s.display("Ahmed","Irbid")
}


