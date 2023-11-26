class Solution {
    public void rotate(int[][] matrix) {
        //int k = 0;
        //int[][] B1 = new int[matrix[0].length][matrix.length];
        for (int i = 0; i<matrix[0].length;i++) {
            for (int j = i; j<matrix.length;j++) {
                int swap = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = swap;            
            }
        }
        for (int i = 0; i<matrix.length;i++) {
            for (int j = 0; j<matrix.length/2;j++) {
                int swap1 = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = swap1;
            }
        }
    }
}