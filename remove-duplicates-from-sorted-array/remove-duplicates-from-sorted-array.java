class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int count = 1;
        int temp;
        if(nums.length != 0) {
            for(int i=0; i < nums.length; i++) {
                if(nums[i] != nums[start]) {
                    start++;
                    temp = nums[i];
                    nums[i] = nums [start];
                    nums[start] = temp;
                    count++;
                } 
            }
        }
        return count;
    }
}