class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> uniqueTable = new HashMap<Integer, Integer>();
        int sum = 0;
        for (int num : nums) {
            if (uniqueTable.containsKey(num)) {
                uniqueTable.put(num, uniqueTable.get(num) + 1);
            } else {
                uniqueTable.put(num, 1);
            }
        }
        for (int key : uniqueTable.keySet()) { // add the keys whose value is 1
            if (uniqueTable.get(key) == 1) {
                sum += key;
            }
        }
        return sum;
    }
}