class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[row][col];

        // Copy the original matrix to ans
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                ans[i][j] = matrix[i][j];

        // If matrix[i][j] == 0, set entire row i and column j to 0 in ans
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                if (matrix[i][j] == 0) {
                    for (int c = 0; c < col; c++) ans[i][c] = 0; // zero row
                    for (int r = 0; r < row; r++) ans[r][j] = 0; // zero column
                }

        // Copy ans back to matrix
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                matrix[i][j] = ans[i][j];
    }
}
