class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for(int i=0;i<9;i++){
            rows[i] = new HashSet<>();
            col[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int r =0 ;r<9;r++){
            for(int c=0;c<9;c++){
                char val = board[r][c];

                if(val == '.') continue;

                int boxIndex = (r/3)*3+(c/3);

                if(rows[r].contains(val)) return false;
                if(col[c].contains(val)) return false;
                if(boxes[boxIndex].contains(val)) return false;

                rows[r].add(val);
                col[c].add(val);
                boxes[boxIndex].add(val);
            }
        }
        return true;
    }
}
