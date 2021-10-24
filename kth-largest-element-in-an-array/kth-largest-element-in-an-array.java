class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Partition solution
        int l = 0, r = nums.length - 1;
        k = nums.length - k;
        
        while(l < r) { // to ensure that left-right boundary condition is not crossed
            int p = partition(nums, l, r); //get position
            if(p > k) { // check if position is in left or right of k and move l and r respectively
                r = p - 1;
            } else {
                l = p + 1;
            }
        }
        return nums[k];
    }
    
    private int partition (int[] arr, int l, int r) {
        Random rand = new Random();
        int index = l + rand.nextInt(r-l);
        int pivot = arr[index];
        int i = l;
        
        swap(arr, index, r); // swapping pivot with r as we need pivot in last location
        
        for(int j = i; j < r; j++) {
            if(arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r); // swapping pivot to correct index position
        return i;
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}