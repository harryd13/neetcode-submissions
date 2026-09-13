class Solution {
    public boolean isValidSudoku(char[][] board) {
        //seen set
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        //iterate:
        for(int i=0; i<9; i++){
            for(int j=0;j<9;j++){
                
                //get val, row,col, box
                char ch = board[i][j];
                if(ch =='.') continue;
                int val = board[i][j] - '1';
                int b = (i/3)*3 + j/3;
                //if it is empty its fine
                
                // chek if seen 
                if(row[i][val] ||
                    col[j][val] ||
                    box[b][val]){
                        return false;
                    }
                row[i][val] = true;
                col[j][val] = true;
                box[b][val] = true;
            }
        }
        return true;
    }
}
