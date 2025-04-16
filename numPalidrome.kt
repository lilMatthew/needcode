class Solution {
    fun isPalindrome(x: Int): Boolean {
        if(x < 0 || (x % 10 == 0 &&x != 0)){
            return false
        }

        var reverseNum = 0
        var originalNum = x
        while(originalNum > reverseNum){
            reverseNum = reverseNum * 10 + originalNum % 10
            originalNum = originalNum / 10
        }
        return originalNum == reverseNum || originalNum == reverseNum / 10


        // val str = x.toString()
        // return str.equals(str.reversed())


        
        
    }
}

fun main(){
    val solution = Solution()
    println(solution.isPalindrome(121)) // Output: true
    println(solution.isPalindrome(-121))
    println(solution.isPalindrome(1223221)) // Output: true
}