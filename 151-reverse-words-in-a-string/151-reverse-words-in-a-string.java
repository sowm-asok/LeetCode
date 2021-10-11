class Solution {
    public String reverseWords(String s) {
         // split words wrt spaces into an array. Spaces will become empty strings
        String arr[] = s.split(" ",-1);
        StringBuilder sb = new StringBuilder();
        // append word to sb in reverse order if word length>0 to eliminate empty strings
        for(int i=arr.length-1; i >= 0; i--) {
            String str = arr[i];
            if(str.length() != 0) {
                // if sb is empty don't add space before word, else add space before word(if adding space after word, again have to trim at end)
                if(sb.length() == 0){
                    sb.append(str);
                }
                else{
                    sb.append(" ");
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}