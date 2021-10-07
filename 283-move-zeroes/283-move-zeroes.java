class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        int left = 0;
        int right = left+1;
        while (right < nums.length) {
            if(nums[left] != 0){
                left++;
                right++;
            }
            else if(nums[left] == 0 && nums[right] != 0){
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            }
            else if(nums[left] == 0 && nums[right] == 0) {
                right++;
            }
        }
    }
}