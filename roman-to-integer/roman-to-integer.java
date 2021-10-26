class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanTable = new HashMap<Character, Integer>();
        romanTable.put('I', 1);
        romanTable.put('V', 5);
        romanTable.put('X', 10);
        romanTable.put('L', 50);
        romanTable.put('C', 100);
        romanTable.put('D', 500);
        romanTable.put('M', 1000);
        
        int result = 0;
        
        // Iterate over character by character and add to response
        // If  current character <= previous --> add current char value (because if greatest value is present first, no subtraction needed)
        //  Else lower value is present first  --> add current char value  --2*(previous char value- since we added in 1st iteration)  Ex: IX
		// as lower value is already added in result
        result = romanTable.get(s.charAt(0));
        
        for(int i = 1; i < s.length(); i++) {
            if(romanTable.get(s.charAt(i)) <=  romanTable.get(s.charAt(i-1))) {
                result = result + romanTable.get(s.charAt(i));
            }
            else {
                result = result + romanTable.get(s.charAt(i)) - 2*romanTable.get(s.charAt(i-1));
            }
        }
        return result;
    }
}