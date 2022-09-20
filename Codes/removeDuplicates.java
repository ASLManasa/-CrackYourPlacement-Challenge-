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