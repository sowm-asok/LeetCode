class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        int rowLength = matrix.length;
        // get transpose of matrix
        for(int i=0; i < rowLength; i++){
            for(int j=0; j < rowLength; j++){
                if(i>j)
                {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                }
            }
        }
            
        //get reverse of transposed matrix
        for(int i=0; i < rowLength; i++){
                int left = 0;
                int right = rowLength - 1;
                while (left < right) {
                    temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;
                    left++;
                    right--;
            }
        }
    }
}