class Solution {]

    public List<List<Integer>> threeSum(int[] nums) {
     
        Arrays.sort(nums);
        List<List<Integer>> toRet = new ArrayList();
        for(int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int lhs = i+1;
            int rhs = nums.length-1;
            int sum = 0-nums[i];
            while (lhs < rhs){
                if(nums[lhs] + nums[rhs] == sum) {
                    toRet.add(Arrays.asList(nums[i], nums[lhs++], nums[rhs--]));
                    while(rhs > lhs && nums[lhs] == nums[lhs-1]){
                        lhs++;
                    }
                    while(rhs > lhs && nums[rhs] == nums[rhs+1]){
                        rhs--;
                    }
                } else if(nums[lhs] + nums[rhs] > sum){
                    rhs--;
                } else {
                    lhs++;
                }
            }
        }
        return toRet;
    }
}