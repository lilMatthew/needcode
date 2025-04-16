class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()) return ""
        var prefix = strs[0]
        for(i in 1 until strs.size){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length - 1)
            }
        }
        return prefix
    }
}

fun main(){
    val solution = Solution()
    println(solution.longestCommonPrefix(arrayOf("flower", "flow", "flight"))) // Output: "fl"
    println(solution.longestCommonPrefix(arrayOf("dog", "racecar", "car"))) // Output: ""
}