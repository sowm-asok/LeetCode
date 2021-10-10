class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right;
        String letter = "";
        Character ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                letter += Character.toLowerCase(ch);
            }
        }
        right = letter.length() - 1;
        while(left<=right) {
            if(letter.charAt(left) != letter.charAt(right)) {
                return false;
            }
            left++;
            right--;
        } 
        return true;
    }
}