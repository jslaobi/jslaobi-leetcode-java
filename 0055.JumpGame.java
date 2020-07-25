class Solution {
    public boolean canJump(int[] nums) {
        int maxJump = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i] >= maxJump){
                maxJump = i;
            }
        }
        
        return maxJump == 0;
    }
}