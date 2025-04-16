class Solution {
    fun removeDuplicates(nums: IntArray): Int {
       var left = nums[0]
       
       
       for(right in i until nums.size){
        if(nums[right] != nums[left]){
            left++
            nums[left] = nums[right]
            
        }
       }
       return left
    }
}