class Solution {

    public boolean isValid(String s) {
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put('(', ')');
        mappings.put('[', ']');
        mappings.put('{', '}');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                stack.push(mappings.get(c));
            } else {
                if (stack.size() == 0 || stack.pop() != c) {
                    return false;
                }
            }
        }

        if (stack.size() != 0) {
            return false;
        }

        return true;
    }
}