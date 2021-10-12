class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<Integer>();
        int top = 0; // for rows
        int bottom = matrix.length - 1; // row size
        int left = 0; // for columns
        int right = matrix[0].length - 1; // column size

        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                spiral.add(matrix[top][i]);
            }
            top++; // closing the boundary
            
            // check for condition after inner boundary left -> right
            if(!(top <= bottom && left <= right)){ 
                break;
            }
            
            for(int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);  
            }
            right--; // closing the boundary
            
            // check for condition after inner boundary top -> bottom
            if(!(top <= bottom && left <= right)){ 
                break;
            }
            
            for(int i = right; i >= left; i--) {
                spiral.add(matrix[bottom][i]);
            }
            bottom--; // closing the boundary
            
            for(int i = bottom; i >= top; i--) {
                spiral.add(matrix[i][left]);
            }
            left++; // closing the boundary
            
        }
        return spiral;
    }
}