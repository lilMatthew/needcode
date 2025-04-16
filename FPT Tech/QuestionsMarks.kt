fun QuestionsMarks(str: String): String {
    var lastDigitIndex = -1
    var lastDigit = -1
    var foundPair = false

    for (i in str.indices) {
        if (str[i].isDigit()) {
            val currentDigit = str[i].toString().toInt()
            if (lastDigit != -1 && lastDigit + currentDigit == 10) {
                val substring = str.substring(lastDigitIndex + 1, i)
                if (substring.count { it == '?' } != 3) {
                    return "false"
                }
                foundPair = true
            }
            lastDigit = currentDigit
            lastDigitIndex = i
        }
    }

    return if (foundPair) "true" else "false"
}

fun main() {
    println(QuestionsMarks("arrb6???4xxbl5???eee5")) // Output: true
    println(QuestionsMarks("aa6?9")) // Output: false
    println(QuestionsMarks("acc?7??sss?3rr1??????5")) // Output: true
    println(QuestionsMarks("5??aaaaaaaaaaaaaaaaaaa?5?5")) // Output: false
    println(QuestionsMarks("9???1???9???1???9")) // Output: true
}