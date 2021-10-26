class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; // k could be greater than nums.length
        
        // sample input --> nums = 1,2,3,4,5,6,7  k = 3
        
        // reversing complete array 
        reverse(nums, 0, nums.length - 1); // nums = 7,6,5,4,3,2,1
        
        // reverse from 0 to k-1(first part) and then k to nums.length(second part) separately
        reverse(nums, 0, k-1); // nums = 5,6,7,4,3,2,1
        reverse(nums, k, nums.length - 1); // nums = 5,6,7,1,2,3,4

    }
    
    // reverse function 
    public void reverse(int nums[], int i, int j) {
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}