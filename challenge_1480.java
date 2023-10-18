/*
*DESCRIPTION:
*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
* Return the running sum of nums.
*/

/* NOTES:
 * beats 100% for runtime (0ms)
 */

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i] = (nums[i-1]+nums[i]);
        }
        return nums;
    }
}