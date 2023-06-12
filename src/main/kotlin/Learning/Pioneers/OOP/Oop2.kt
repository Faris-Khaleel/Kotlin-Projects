class Bill
{
    var billNo:Int=0
    var billType:String=""

    constructor()
    {
       billType="Cash"
    }

    fun show()
    {
        println(billNo)
        println(billType)
    }
}

fun main(args: Array<String>) {
    var b=Bill()
    b.billNo=123456
    b.show()
}



