class Solution {
    public int findDuplicate(int[] nums) {
/*Approach -1
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1])
                return nums[i];
        }

        return -1;
        Tc - o(nlogn)*/
/*Approaqch -2
        Set<Integer> seen = new HashSet<Integer> ();
        for(int num :nums)
        {
            if(seen.contains(num))
            {
                return num;
            }
            seen.add(num);
        }
        
        return -1;
        */
/*      Approach -3
        int duplicate = -1;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.abs(nums[i]);
            if (nums[cur] < 0) {
                duplicate = cur;
                break;
            }
            nums[cur] *= -1;
        }
        return duplicate; */
        //Approach -4 Time complexity - o(n) sc- o(1)
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}