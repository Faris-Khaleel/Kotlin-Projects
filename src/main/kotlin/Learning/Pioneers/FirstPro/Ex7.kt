fun main(args: Array<String>) {

    var students=HashMap<String, Int>()

    students.put("Ali",85)
    students.put("Omer",90)
    students.put("Khalid",81)
    students.put("Hasan",82)
    students.put("Abdulla",50)

    println(students["Ali"])

    for (s in students.keys)
    {
        println(s)
        println(students[s])
    }
}
