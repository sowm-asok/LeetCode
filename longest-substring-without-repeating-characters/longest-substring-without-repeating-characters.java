class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 ) return 0;
        int longest = 1, start = 0, end = 0;
        HashSet<Character> hs = new HashSet<Character>();
        
        for(int i = 0; i< s.length(); i++) {
            // handle start = -1 and end = -1
            
            // if current element is unique, add to hs
            if(! hs.contains(s.charAt(i))) {
                hs.add(s.charAt(i));
                end++;
            }
            else{
                while(hs.contains(s.charAt(i))) {
                    hs.remove(s.charAt(start));
                    start++;
                }
                hs.add(s.charAt(i));
                end++;
            }
            if(end-start > longest) {
                longest = end-start;
            }
            
        }
        return longest;
    }
}