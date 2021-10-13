class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] id1 = new int[s.length()];
        int[] id2 = new int[t.length()];
        int count=1;
        if(s.length() != t.length()){
            return false;
        }
        id1 = addId(s);
        id2 = addId(t);
        for(int i=0; i < s.length(); i++) {
            if(id1[i] != id2[i]){
                return false;
            }
        }
        return true;
    }
    
    public int[] addId(String s){
        int count = 1;
        int idOrder[] = new int[s.length()];
        HashMap<Character, Integer> table = new HashMap<Character, Integer>();
            for(int i=0; i < s.length(); i++) {
                if(table.containsKey(s.charAt(i))){
                    idOrder[i] = table.get(s.charAt(i));   
                }
                else {
                    table.put(s.charAt(i), count);
                    idOrder[i] = count;
                    count++;
                }
            }
        return idOrder;
    }
}