class Solution {
    public boolean isValidSudoku(char[][] board) {
        //seen set
        Set<String> seen = new HashSet<>();
        //iterate:
        for(int i=0; i<9; i++){
            for(int j=0;j<9;j++){
                
                //get val, row,col, box
                char val = board[i][j];
                int r = i;
                int c = j;
                int box = (i/3)*3 + j/3;
                //if it is empty its fine
                if(val =='.') continue;
                // chek if seen 
                if(!seen.add(val + "row" + r ) ||
                    !seen.add(val + "col" + c ) ||
                    !seen.add(val + "box" + box )){
                        return false;
                    }
            }
        }
        return true;
    }
}
