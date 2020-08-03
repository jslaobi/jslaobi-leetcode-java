class Solution {
    public int countBattleships(char[][] board) {
        int result = 0;
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                if(board[row][col] == 'X'){
                    result++;
                    dfs(board, row, col);
                }
            }
        }
        return result;
    }
    
     public void dfs(char[][] board, int row,int col){
            if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col] !='X'){
                return;
            }
            board[row][col] = '.';
            dfs(board,row-1,col);
            dfs(board,row+1,col);
            dfs(board,row,col-1);
            dfs(board,row,col+1);
        }
}