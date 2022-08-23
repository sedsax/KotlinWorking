// Hesap makinesi uygulamamda sayıları ve operatörleri daha iyi ayırt edebilmek için Regex sınıfını kullanmak istedim, bu yüzden kod üstünde denelemeler yapıyorum.

import java.util.regex.Matcher
import java.util.regex.Pattern

fun main() {

    val expressions = listOf("16 + 11", "12 * 5", "27 / 3", "2 - 8")
    val pattern = "(\\d+)\\s+([-+*/])\\s+(\\d+)".toRegex()

   // val pattern4 = "\\b([1-9]|10)\\b".toRegex()
  //  val pattern2 = "(\\d+)\\s+([-+*/])\\s+(\\d+)".toPattern(0)

    for (expression in expressions) {

        val matches = pattern.findAll(expression)

        matches.forEach { matchResult ->

            val value1 = matchResult.groupValues[1].toInt()
            val value2 = matchResult.groupValues[3].toInt()

            val msg = when (matchResult.groupValues[2]) {

                "+" -> "$expression = ${value1 + value2}"
                "-" -> "$expression = ${value1 - value2}"
                "*" -> "$expression = ${value1 * value2}"
                "/" -> "$expression = ${value1 / value2}"
                else -> "Unknown operator"
            }

            println(msg)
        }
    }
   // val deneme = "(\\d+)\\s+([-+*/])\\s+(\\d+)".toRegex().options
    //val deneme2 = "({0,9})".toRegex()
    //val deneme3 = pattern.findAll(expressions[0]) //matches
    println(pattern)
    println(expressions.size)
    val x = "(/-)".toRegex()
    println(x)
    val d: Regex = Regex.fromLiteral("aqwsdr")
    val p: Pattern = Pattern.compile("a*b")
    //val a: Pattern = Pattern.matches(pattern,"a")
    val m: Matcher = p.matcher("aaaaab")
    val b: Boolean = m.matches()
    val bb = Pattern.matches("a*b", "aaaaab")
    println(p)
    println(m)
    println(b)
    println(bb)
    println(d)

}
/*
---------------OUTPUT----------------
16 + 11 = 27
12 * 5 = 60
27 / 3 = 9
2 - 8 = -6
(\d+)\s+([-+*/])\s+(\d+)
4
(/-)
a*b
java.util.regex.Matcher[pattern=a*b region=0,6 lastmatch=aaaaab]
true
true
aqwsdr
*/
