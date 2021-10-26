class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] counts = new int[nums.length + 1];
        List<Integer> list = new ArrayList<>();
        
        for (int i : nums) {
            counts[i]++;
        }
        
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] == 0) {
                list.add(i);
            } 
        }
        return list;     
    }
}