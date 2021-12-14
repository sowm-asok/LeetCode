class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder result = removeInvalidClosing(s, '(', ')');
        result = removeInvalidClosing(result.reverse(), ')', '(');
        return result.reverse().toString();
    }
        
    private StringBuilder removeInvalidClosing(CharSequence string, char open, char close) {
        
        int count = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i< string.length(); i++) {
            char ch = string.charAt(i);
            if(ch == open) {
                count++;
            }
            else if(ch == close) {
                if(count == 0) {
                    continue;
                }
                count--;
            }
            sb.append(ch);
        }
        
        return sb;
    }
}