class Solution{
    fun twoSum(nums: IntArray, target: Int) : IntArray{
       val map = mutableMapOf<Int,Int>() //create a mutable map store the number and indices
        for(i in nums.indices){
            val complement = target - nums[i]
            if(map.containsKey(complement)){
                return intArrayOf(map[complement]!!,i) //check complement exist in map, if yes return complement and current number
            }
            map[nums[i]] = i // if complement not found add the number and index to map
        }
        throw IllegalArgumentException("No two sum solution")
    }
}

fun main(){
    val nums = intArrayOf(2,7,11,15)
    val target = 9
    val sol = Solution()
    println(sol.twoSum(nums,target).contentToString())
}