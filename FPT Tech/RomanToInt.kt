fun romanToInt(s: String): Int {
    val romanMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    var prevValue = 0

    for (char in s.reversed()) {
        val value = romanMap[char] ?: 0
        if (value >= prevValue) {
            result += value
        } else {
            result -= value
        }
        prevValue = value
    }

    return result
}

fun main() {
    println(romanToInt("III")) // Output: 3
    println(romanToInt("IV")) // Output: 4
    println(romanToInt("IX")) // Output: 9
    println(romanToInt("LVIII")) // Output: 58
    println(romanToInt("MCMXCIV")) // Output: 1994
}