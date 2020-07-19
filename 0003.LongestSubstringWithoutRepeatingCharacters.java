class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int j = 0, maxLength = 0;
        if (s == null || s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                maxLength = Math.max(maxLength, set.size());
            } else {
                while (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(j));
                    j++;
                }

                set.add(s.charAt(i));
            }
        }

        return maxLength;
    }
}