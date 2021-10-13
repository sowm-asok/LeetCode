class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right;
        StringBuilder str = new StringBuilder();
        Character ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                str.append(Character.toLowerCase(ch));
            }
        }
        right = str.length() - 1;
        while(left<=right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        } 
        return true;
    }
}