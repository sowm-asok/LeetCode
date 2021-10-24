class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> uniqueTable = new HashMap<Integer, Integer>();
        for (int num: nums) {
            if(uniqueTable.containsKey(num)) {
                uniqueTable.put(num, uniqueTable.get(num) + 1);
            } else {
                uniqueTable.put(num, 1);
            }
        }
        
        for (int key : uniqueTable.keySet()) {
            if(uniqueTable.get(key) >= 2) {
                return true;
            }
        }
        return false;
    }
}