class Solution {
    public int compress(char[] chars) {
        String s = "";
        int start = 0;
        int count = 0;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[start] != chars[i]) {
                list.add(String.valueOf(chars[start]));
                list.add(Integer.toString(i - start));
                start = i;
            }
        }
        // Add the last group
        list.add(String.valueOf(chars[start]));
        list.add(Integer.toString(chars.length - start));
        int insert = 0;
        int index = 0;

        for(int i=0; i < list.size() ; i++) {
            String str = list.get(i);
            if(str.equals("1") && (i%2 != 0) ) {
                continue;
            }
            else {
                for(int j=0; j<str.length(); j++){
                    chars[insert] = str.charAt(j);
                    insert++;
                }
            }
            index++;
        }
        return insert;
    }
}