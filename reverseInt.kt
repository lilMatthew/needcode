class Solution {
    fun reverse(x: Int): Int {
        var num = x
        var reversed = 0

        while (num != 0) {
            val pop = num % 10
            num /= 10

            if (reversed > Int.MAX_VALUE / 10 || (reversed == Int.MAX_VALUE / 10 && pop > 7)) return 0
            if (reversed < Int.MIN_VALUE / 10 || (reversed == Int.MIN_VALUE / 10 && pop < -8)) return 0

            reversed = reversed * 10 + pop
        }

        return reversed
    }
}

fun main() {
    val solution = Solution()
    println(solution.reverse(123)) // Output: 321
    println(solution.reverse(-123)) // Output: -321
    println(solution.reverse(120)) // Output: 21
    println(solution.reverse(0)) // Output: 0
}