class Solution {
    public void setMatrixZeroes(int[][] mat) {
        
         int n = mat.length;
        int m = mat[0].length;
        boolean isFirstRowZero = false, isFirstColZero = false;

        for (int j = 0; j < m; j++) {
            if (mat[0][j] == 0) {
                isFirstRowZero = true;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 0) {
                isFirstColZero = true;
                break;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        if (isFirstRowZero) {
            for (int j = 0; j < m; j++) {
                mat[0][j] = 0;
            }
        }

        if (isFirstColZero) {
            for (int i = 0; i < n; i++) {
                mat[i][0] = 0;
            }
        }
    }
}
