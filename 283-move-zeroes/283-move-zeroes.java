class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        int left = 0;
        int right;
        while(left+1 < nums.length){
            right = left+1;
            
            // System.out.println("left" + nums[left]);
            // System.out.println("right" + nums[right]);
            
            if(nums[left] == 0 && nums[right] != 0) {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            else if(nums[left] == 0 && nums[right] == 0){
                while(right<nums.length && nums[right] == 0){
                    right++;
                }
                if(right == nums.length)
                    return;
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            
            left+=1;
        }
    }
}