/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

enum class State {
    IDLE, RUNNING, FINISHED                           
}

fun main() {
    val state = State.RUNNING                         
    val message = when (state) {                      
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)
    
    
    val txt = "c"
    val option = when(txt) {
        "a" -> {1}
        "b" -> {2}
        "c" -> {3}
        else->{4}
    }
   println(option)
   
    val riskAssessment = 43
    val risk = when (riskAssessment) {
    in 1..20 -> "negligible risk"
    in 21..40 -> "minor risk"
    in 41..60 -> "major risk"
    else -> "undefined risk"
    }
    println(risk) // Prints: major risk
    
    val day = 2

   when (day) {
     1, 2, 3, 4, 5 -> println("Weekday")
     else -> println("Weekend")
   }
   println("------------------------------------")
   
   cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {                                
    when (obj) {                                     // 1   
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Unknown")                   // 6
    }   
}
class MyClass


/*
It's running
3
major risk
Weekday
------------------------------------
Greeting
One
Long
Not a string
Unknown

*/
