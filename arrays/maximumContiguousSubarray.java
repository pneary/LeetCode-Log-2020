class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum = Integer.max(nums[i], sum+nums[i]);
            max = Integer.max(max, sum);
        }
        return max;
    }
}