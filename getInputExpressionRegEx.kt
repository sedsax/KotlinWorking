fun main() {
    fun getInputExpression(input: String): String {
        var expression = input.replace(Regex("÷"), "/")
        //var expression = input.text.replace(Regex("÷"), "/")
        expression = expression.replace(Regex("x"), "*")
       // expression = expression.removeRange(Regex("",""))
        return expression
    }
    println(getInputExpression("3÷7+1x22÷5"))
    println(getInputExpression("4x5÷2+60x2.0"))

}

//------------------OUTPUT-------------------
/*
3/7+1*22/5
4*5/2+60*2.0
*/
