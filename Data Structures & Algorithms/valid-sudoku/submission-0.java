class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                else{
                    if(set.contains(board[i][j])){
                        return  false;
                    }
                    else{
                        set.add(board[i][j]);
                    }
                }
            }
        }
        for(int i=0;i<board.length;i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                else{
                    if(set.contains(board[j][i])){
                        return  false;
                    }
                    else{
                        set.add(board[j][i]);
                    }
                }
            }
        }
        int[][] starts = {{0, 0}, {0, 3}, {0, 6},
                          {3, 0}, {3, 3}, {3, 6},
                          {6, 0}, {6, 3}, {6, 6}};
        
        for (int[] start : starts) {
            Set<Character> set = new HashSet<>();
            for (int row = start[0]; row < start[0] + 3; row++) {
                for (int col = start[1]; col < start[1] + 3; col++) {
                    char item = board[row][col];
                    if (item != '.' && !set.add(item)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
