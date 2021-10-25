class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int temp;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            while (i < nums.length-1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (temp == nums[i]) {
                result.add(temp + "");
            } else {
                result.add(temp + "->" + nums[i]);
            }       
        }
        return result;
    }
}