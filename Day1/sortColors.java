// Question : https://leetcode.com/problems/sort-colors/
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
/*
 * Approaches 
 * 1 . Sort the array using inbuilt techniques 
 * 2. Sort using any sorting algo or merge sort.
 * 3. count sort
 * 4. Dutch national flag approach - O(n) - inplace sorting
 */
class Solution {
    public void sortColors(int[] nums) {
        //Dutch national flag approach
        int low =0;
        int mid =0;
        int high = nums.length-1;
        int temp =0;
        while(mid <= high)
        {
            switch(nums[mid])
            {
                case 0:
                    {
                        temp = nums[low];
                        nums[low] = nums[mid];
                        nums[mid] = temp;
                        mid++;
                        low++;
                        break;
                        
                    }
                case 1:
                    {
                        mid++;
                        break;
                    }
                    case 2:
                    {
                        temp = nums[mid];
                        nums[mid] = nums[high];
                        nums[high] = temp;
                        high--;
                        break;
                    }
            }
        }
        
    }
}