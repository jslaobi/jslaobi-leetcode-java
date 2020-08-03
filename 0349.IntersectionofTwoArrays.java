class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();

        Set<Integer> result = new HashSet<Integer>();

        for(int num : nums1){
            set.add(num);
        }

        for(int num : nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        int[] resultArr = new int[result.size()];
        int i = 0;
        for (int num : result) {
            resultArr[i++] = num;
        }
        return resultArr;
    }
}