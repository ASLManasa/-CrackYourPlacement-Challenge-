// Question : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
/*
 * Approaches 
 * 1 . Sort the array and solve.
 * 2. use negative indexing and count
 * 3. modify the array  - o(n)
 */
class Solution {
    public int removeDuplicates(int[] nums) {
         int temp = 0;
        //if length of the array is 0 then no change
        if (nums.length == 0) {
            return 0;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[temp] != nums[i]) {
                //if the number is not duplicate then we can put it after the element we want 
                nums[++temp] = nums[i];
            }
        }
        return temp + 1;
        
    }
}