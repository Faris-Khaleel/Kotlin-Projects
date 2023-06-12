fun main(args: Array<String>) {

   var messages=ArrayList<String>()
    messages.add("Hello")
    messages.add("welcome")
    messages.add("Hi")

    println(messages[2])

    for (m in messages)
        println(m)

    messages.removeAt(1)
    messages.remove("Hi")

    for (m in messages)
        println(m)

    messages.clear()


}
