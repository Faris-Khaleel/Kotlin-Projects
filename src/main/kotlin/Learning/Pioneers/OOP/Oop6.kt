class Employee
{
    var name:String?=null
    var salary:Double?=null
    fun show()
    {
        println(name)
        println(salary)
    }
}
fun main(args: Array<String>) {
    var e=Employee()
    println("Enter employee name")
    e.name= readLine().toString()
    println("Enter employee salary")
    e.salary= readLine()?.toDouble()
    e.show()

}
