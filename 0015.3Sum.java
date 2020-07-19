class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int start = i + 1, end = nums.length - 1;
                while (start < end) {
                    // 3 situations: equal, greater than, or less than.
                    if (nums[i] + nums[start] + nums[end] == 0) {
                        result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        start++;
                        end--;
                        while (start < end && nums[start] == nums[start - 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end + 1]) {
                            end--;
                        }
                    } else if (nums[i] + nums[start] + nums[end] < 0) {
                        start++;
                    } else {
                        end--;
                    }

                }
            }
        }
        return result;
    }
}