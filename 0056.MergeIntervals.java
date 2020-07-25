class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) {
            return intervals;
        }
       Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        
        int[] curr = intervals[0];
        ArrayList<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            if (curr[1] >= interval[0]) {
                curr[1] = Math.max(curr[1], interval[1]);
            } else {
                result.add(curr);
                curr = interval;
            }
        }

        if (curr.length != 0) {
            result.add(curr);
        }

        return result.toArray(new int[result.size()][]);
    }
}