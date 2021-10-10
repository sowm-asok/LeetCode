class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] id1 = new int[s.length()];
        int[] id2 = new int[t.length()];
        int count=1;
        if(s.length() != 0 && t.length() != 0 && s.length() == t.length()){
            id1 = addId(s);
            id2 = addId(t);
            
            for(int i=0; i < s.length(); i++) {
                System.out.println("iteration: " + i);
                if(id1[i] != id2[i]){
                    System.out.println("id1" + " :" + id1[i]);
                    System.out.println("id2" + " :" + id2[i]);
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public int[] addId(String s){
        int count = 1;
        int idOrder[] = new int[s.length()];
        HashMap<Character, Integer> table = new HashMap<Character, Integer>();
            for(int i=0; i < s.length(); i++) {
                if(table.containsKey(s.charAt(i))){
                    idOrder[i] = table.get(s.charAt(i));
                    // System.out.println(s.charAt(i) + " :" + idOrder[i]);
                    // table.put(s.charAt(i), table.get(s.charAt(i))+1); // why are you incrementing the id here?
                    
                }
                else {
                    // System.out.println(s.charAt(i) + " :" + count);
                    table.put(s.charAt(i), count);
                    idOrder[i] = count;
                    count++;
                }
            }
        return idOrder;
    }
}