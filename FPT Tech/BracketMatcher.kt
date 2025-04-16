fun BracketMatcher(str: String): Int {
    var balance = 0

    for (char in str) {
        when (char) {
            '(' -> balance++
            ')' -> {
                balance--
                if (balance < 0) return 0
            }
        }
    }

    return if (balance == 0) 1 else 0
}

fun main() {
    println(BracketMatcher("(hello (world))")) // Output: 1
    println(BracketMatcher("((hello (world))")) // Output: 0
    println(BracketMatcher("hello world")) // Output: 1
}