class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean [][] rows = new boolean[9][10];
        boolean [][] col = new boolean[9][10];
        boolean [][] boxes = new boolean[9][10];

        for(int r=0; r<9;r++){
            for(int c=0;c<9;c++){
        char val = board[r][c];
        if(val=='.') continue;

        int num=val -'0';
        int boxindx = (r/3)*3 + (c/3);
        if(rows[r][num]) return false;
        if(col[c][num]) return false;
        if(boxes[boxindx][num]) return false; 

        rows[r][num]    = true;
        col[c][num]    = true;
        boxes[boxindx][num] = true;
            }
        }
        return true;
    }
}
