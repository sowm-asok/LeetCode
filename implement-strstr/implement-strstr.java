class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        }
        // char[] hay = haystack.toCharArray();
        // char[] need = needle.toCharArray();
        // int needleIndex = 0;
        boolean status = false;
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) { 
                if((haystack.length() - i) >= needle.length()) {
                    status = (haystack.substring(i, i+needle.length()).equals(needle));
                }
            }
            if(status) {
                return i;  
            }
        }
        return -1;
    }   
    
    // private boolean checkNeedleInHaystack(String haySubstring, char[] need) {
    //     char[] haystackSubstring = haySubstring.toCharArray();
    //     int count = 0;
    //     for(int i = 0; i < need.length; i++) {
    //         if(haystackSubstring[i] == need[i]){
    //             count++;
    //         }
    //     }
    //     if(count == need.length){
    //         return true;
    //     }
    //     return false;
    // }
}