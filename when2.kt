fun main() {
            
    			var operator = "*"
                var temp = "8"
                var txt = "9"
    			when(operator) {
                        "+" -> txt = (temp.toInt() + txt.toInt()).toString()
                        "-" -> txt = (temp.toInt() - txt.toInt()).toString()
                        "*" -> txt = (temp.toInt() * txt.toInt()).toString()
                        "/" -> txt = (temp.toInt() / txt.toInt()).toString()
                       // "+" -> txt = (temp.toInt() + txt.toInt()).toString()
                    }
             
                println(txt)
                temp="48"
    			txt="3"
                operator = "/"
                when(operator) {
                        "+" -> {txt = (temp.toInt() + txt.toInt()).toString()}
                        "-" -> {txt = (temp.toInt() - txt.toInt()).toString()}
                        "*" -> {txt = (temp.toInt() * txt.toInt()).toString()}
                        else -> {txt = (temp.toInt() / txt.toInt()).toString()}
                       // "+" -> txt = (temp.toInt() + txt.toInt()).toString()
                    }
                println(txt)
    
}

/*
----------------OUTPUT-------------
72
16
*/
