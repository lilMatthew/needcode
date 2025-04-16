/* 
Given a binary array nums, return the maximum number of consecutive 1's in the array.
Input: nums = [1,1,0,1,1,1]
Output: 3 */

class MaxConsecutiveOnes {
    fun findMaxConsecutiveOnes(nums: IntArray) : Int{
        var count = 0
        var maximum = 0
        for(i in nums.indices){
            if(nums[i] == 1){
                count ++
                maximum = Math.max(maximum,count)
            } else {
                count =0
            }
        }
        return maximum
    }
}


fun  main() {
    val nums = intArrayOf(1,1,0,1,1,1)
    val max = MaxConsecutiveOnes()
    println(max.findMaxConsecutiveOnes(nums))
}