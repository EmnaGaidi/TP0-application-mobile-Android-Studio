package com.gl4.tp

fun main(argv : Array<String> ){
    println("Hello")
    var message1: String? = "My message can possibly be null !"
    message1?.uppercase()
    /*
    var hello = "Hello"
    hello = "Hello world!"

    println(hello)

    var toto:String = "Toto"

    println(toto)

    var message: String? = "I’m learning Kotlin!"
    message = null
    if (message != null){
        println(message.toString())
    }
    */
     println(somme(1,2))
    sayMyName("Amel")
    println(sayHello())

    val languages =  listOf<String>("C++","Java","Kotlin","PHP")// Créez une liste ordonnée de plusieurs languages de programation
    println("Languages :")
    showList(languages)
    println("Odd Numbers to 10 :")
    oddNumbersTo10()
    println("--------------")
    println(operation(6,2,'*'))
}
fun somme(a : Int,b:Int) = a+b
fun sayMyName(name : String) { println(" $name ") }
fun sayHello()= "Hello"
fun showList(list: List<String>){
    // Complétez la fonction pour afficher les éléments de la liste
    for (i in 0 until list.size){
        println(list[i])
    }
}
fun oddNumbersTo10(){
    for(i in 0..10){
        if (i%2 == 0){
            println(i)
        }
    }
}
fun operation(a : Int,b:Int, op:Char): Int {
    return when(op){
        '+' -> a+b
        '-' -> a-b
        '/' -> a/b
        '*'-> a*b
        else -> a%b
    }
}

