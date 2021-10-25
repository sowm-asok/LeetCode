class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word = strs[0];
        for(int i = 1; i < strs.length; i++) {
            int p1 = 0;
            while( (p1 < strs[i].length()) && (p1 < word.length()) && (word.charAt(p1) == strs[i].charAt(p1))) {
                p1++;
            }
            word = word.substring (0, p1);
        }
        return word;
    }
}