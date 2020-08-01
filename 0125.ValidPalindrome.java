class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        
        int left = 0;
        int right = s.length()-1;
        
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left)) !=  Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}