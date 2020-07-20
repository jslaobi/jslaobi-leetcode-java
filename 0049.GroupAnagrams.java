class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }
        HashMap<String, List> map = new HashMap<String, List>();
        int[] characters = new int[26];
        for (String str : strs) {
            Arrays.fill(characters, 0);
            for (int i = 0; i < str.length(); i++) {
                int ascii = str.charAt(i) - 97;
                characters[ascii]++;
            }
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append(characters[i]);
            }
            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList(map.values());
    }
}