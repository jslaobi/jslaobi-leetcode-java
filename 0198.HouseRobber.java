class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int length = nums.length;
        int[] memo = new int[length];
        memo[0] = nums[0];
        memo[1] = Math.max(memo[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            memo[i] = Math.max((memo[i-2] + nums[i]),memo[i-1]);
        }
        return memo[length-1];
    }
}