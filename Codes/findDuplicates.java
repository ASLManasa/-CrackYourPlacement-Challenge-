import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> arr = new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
           int val = Math.abs(nums[i]);
           if(nums[val - 1] < 0) arr.add(val);//logic for checking val is duplicate or not
            else nums[val - 1] = - nums[val - 1];//if val is not duplicate , mark it visited now
        }
        return arr;
       

    }
}