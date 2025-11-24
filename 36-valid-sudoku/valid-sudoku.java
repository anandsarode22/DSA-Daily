class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                char value = board[r][c];
                if(value == '.') continue;

                String rowKey = value + " in row " + r;
                String colKey = value + " in col " + c;
                String boxKey = value + " in box " + (r/3) + "-" + (c/3);

                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                    return false;
                }
            }
        }
        return true;
    }
}