class Solution {

    public boolean valid(int matrix[][], int a, int b) {
        int r = matrix.length;
        int c = matrix[0].length;

        int i = a;
        int j = b;

        int temp = matrix[i][j];
        boolean isvalid = true;

        while (i < r && j < c) {
            if (matrix[i][j] != temp) {
                isvalid = false;
            }
            i++;
            j++;
        }

        return isvalid;
    }

    public boolean isToeplitzMatrix(int[][] matrix) {

        boolean ans = true;
        int r = matrix.length;
        int c = matrix[0].length;
        for (int j = 0; j < c; j++) {
            boolean temp = valid(matrix, 0, j);
            if (temp == false) {
                ans = false;
            }
        }
        for (int i = 1; i < r; i++) {
            boolean temp = valid(matrix, i, 0);
            if (!temp) {
                ans = false;
            }
        }

        return ans;
    }
}