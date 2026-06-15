class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i=0;
        int rowLen = board.length;
        int colLen= board[0].length;
        int j = i;
        //Column Based Approach
        while (j < colLen) {
            Set<Character> colSet = new HashSet<>();
            while (i < colLen) {
                char d = board[i][j];
                if (colSet.contains(d) && d != '.') {
                    return false;
                }
                if (d != '.') {
                    colSet.add(board[i][j]);
                }
                i++;
            }
            i=0;
            j++;
        }
        i = 0;
        j = 0;
        //Row Based Approach
        while (i < rowLen) {
            Set<Character> rowSet = new HashSet<>();
            while (j < rowLen) {
                char d = board[i][j];
                if (rowSet.contains(d) && d != '.') {
                    return false;
                }
                if (d != '.') {
                    rowSet.add(d);
                }
                j++;
            }
            j=0;
            i++;
        }
        for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();
            for (int k = 0; k < 3; k++) {
                for (int l = 0; l < 3; l++) {
                    int row = (square / 3) * 3 + k;
                    int col = (square % 3) * 3 + l;
                    if (board[row][col] == '.') {
                        continue;
                    }
                    if (seen.contains(board[row][col])) {
                        return false;
                    }
                    seen.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
