class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    boolean solve(char[][] b) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (b[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (valid(b, i, j, c)) {
                            b[i][j] = c;
                            if (solve(b)) return true;
                            b[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean valid(char[][] b, int r, int c, char x) {
        for (int i = 0; i < 9; i++) {
            if (b[r][i] == x || b[i][c] == x ||
                b[r / 3 * 3 + i / 3][c / 3 * 3 + i % 3] == x)
                return false;
        }
        return true;
    }
}