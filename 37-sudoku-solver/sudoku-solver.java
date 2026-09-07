class Solution {
    boolean[][] row = new boolean[9][9];
    boolean[][] col = new boolean[9][9];
    boolean[][] box = new boolean[9][9];

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (board[i][j] != '.') {
                    int n = board[i][j] - '1';
                    int b = (i / 3) * 3 + j / 3;
                    row[i][n] = col[j][n] = box[b][n] = true;
                }

        solve(board);
    }

    boolean solve(char[][] b) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (b[i][j] == '.') {
                    int boxId = (i / 3) * 3 + j / 3;

                    for (int n = 0; n < 9; n++) {
                        if (!row[i][n] && !col[j][n] && !box[boxId][n]) {
                            b[i][j] = (char) (n + '1');
                            row[i][n] = col[j][n] = box[boxId][n] = true;

                            if (solve(b)) return true;

                            b[i][j] = '.';
                            row[i][n] = col[j][n] = box[boxId][n] = false;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}