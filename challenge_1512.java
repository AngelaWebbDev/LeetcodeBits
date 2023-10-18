/*
 * DESCRIPTION:
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */

/* NOTES:
 * beats 75.26% for runtime (1ms)
 * beats 70.3% for memory (39.6mb)
 */

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if((nums[i]==nums[j]) && (i<j))
                    count++;
            }
            
        }
        return count;
    }
}