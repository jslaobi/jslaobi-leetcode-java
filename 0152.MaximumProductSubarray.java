class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] maxProductMemo = new int[n];
        int[] minProductMemo = new int[n];
        maxProductMemo[0] = nums[0];
        minProductMemo[0] = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            maxProductMemo[i] = Math.max(nums[i], Math.max(nums[i] * maxProductMemo[i-1], nums[i]*minProductMemo[i-1]));
            minProductMemo[i] = Math.min(nums[i], Math.min(nums[i] * maxProductMemo[i-1], nums[i]*minProductMemo[i-1]));
            max = Math.max(max, maxProductMemo[i]);
        }
       return max;
    }
}