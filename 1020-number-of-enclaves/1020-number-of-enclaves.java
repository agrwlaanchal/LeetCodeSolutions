class Solution {
    public int numEnclaves(int[][] board) {
        
          int row = board.length;
        int col = board[0].length;
        
        for(int i=0;i<row; i++){
            for(int j=0;j<col; j++){
                if(board[i][j]==1 && (i==0 || i==row-1 || j==0 || j==col-1)){ //check if 0 on boundry. 
                    capture(i, j, board, row, col);
                }
            }
        }
        
        // flip O to X now 
        int count =0; 
        for(int i=0;i<row; i++){
            for(int j=0;j<col; j++){
                if(board[i][j]==1){
                    board[i][j]=0;
                    count++;
                }
                
                   
            }
        }
        
        return count;
        
    }
    
    
      private void capture(int i, int j, int[][]board, int row, int col){
        
        if(i<0 || j<0 || i>=row || j>=col || board[i][j]!=1)
            return;
        
        board[i][j]=-1;
         
        capture(i-1, j, board, row, col);
        
         capture(i+1, j, board, row, col);
         capture(i, j-1, board, row, col);
         capture(i, j+1, board, row, col);
    }
    
}