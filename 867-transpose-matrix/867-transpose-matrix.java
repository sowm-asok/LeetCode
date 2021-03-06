class Solution {
    public int[][] transpose(int[][] matrix) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int[][] transpose = new int[columnLength][rowLength];
        for(int i=0; i < rowLength; i++){
            for(int j=0; j< columnLength; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}