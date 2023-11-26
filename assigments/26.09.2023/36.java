class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet H = new HashSet();
        for (int i = 0; i<9; i++) {
            for (int j = 0; j<9; j++) {
                if (board[i][j] != '.') {
                    if (!H.add("row" + i + board[i][j]) || !H.add("colum" +j + board[i][j])) {
                        return false;
                    }
                    if (!H.add("BOXES" + (i/3)*3 + j/3 + board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}