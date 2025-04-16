import java.math.BigInteger

fun factorial(n: Int): BigInteger {
    var result = BigInteger.ONE
    for (i in 1..n) {
        result = result.multiply(BigInteger.valueOf(i.toLong()))
    }
    return result
}

fun bracketCombinations(num: Int): BigInteger {
    if (num == 0) return BigInteger.ONE
    val numerator = factorial(2 * num)
    val denominator = factorial(num + 1).multiply(factorial(num))
    return numerator.divide(denominator)
}

fun main() {
    val num = 8
    println("Number of valid combinations for $num pairs of parentheses: ${bracketCombinations(num)}")
}