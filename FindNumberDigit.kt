class Solution {
    fun findNumbers(nums: IntArray): Int {
        var count = 0
        for (i in nums.indices) {
            if (numDigits(nums[i]) % 2 == 0) {
                count++
            }
        }
        return count
    }

    private fun numDigits(num: Int): Int {
        return if (num == 0) 1 else Math.floor(Math.log10(num.toDouble()) + 1).toInt()
    }
}

fun main() {
    val nums = intArrayOf(12, 345, 2, 6, 7896)
    val sol = Solution()
    println(sol.findNumbers(nums)) 
}