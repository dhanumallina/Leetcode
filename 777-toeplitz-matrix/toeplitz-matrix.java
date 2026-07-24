class Solution {
    public boolean checkDiagonal(int[][] matrix, int i, int j) {
        int r = matrix.length;
        int c = matrix[0].length;
        int temp = matrix[i][j];
        while (i < r && j < c) {
            if (matrix[i][j] != temp) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (!checkDiagonal(matrix, 0, j)) {
                return false;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (!checkDiagonal(matrix, i, 0)) {
                return false;
            }
        }
        return true;
    }
}