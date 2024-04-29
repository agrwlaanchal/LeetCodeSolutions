class Solution {
    public int countBattleships(char[][] board) {
     
        
        int count =0; 
        for(int i=0; i<board.length;i++){
            
            for(int j=0;j<board[i].length;j++){
                
                if(board[i][j]=='X'){
                    count++;
                    dfs(i, j, board);
                }
                
            }
            
        }
        return count;
        
        
    }
    
    public void dfs(int i, int j, char[][]board){
        
        
        board[i][j]='.';
        
        if(i+1<board.length && board[i+1][j]=='X'){
            dfs(i+1,j, board);
        }
        
        if(j+1<board[i].length&&board[i][j+1]=='X'){
            dfs(i, j+1, board);
        }
        
    }
    
}