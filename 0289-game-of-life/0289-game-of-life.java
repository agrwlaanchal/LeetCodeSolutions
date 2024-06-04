class Solution {
    public void gameOfLife(int[][] board) {
        
        int[][] res = new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                
                int num = board[i][j];
                
                int temp = checkAliveNeigh(board, i, j);
                // res[0] = alive neighbours
                // res[1] = dead neighbours
                
               
                if(num==1){
                    
                    if(temp<2){
                        res[i][j]=0;
                    }else if(temp<=3){
                        res[i][j]=1;
                    }else{
                        res[i][j]=0;
                    }
                    
                }else{
                    
                    if(temp==3){
                        res[i][j]=1;
                    }else{
                        res[i][j]=0;
                    }
                    
                }
                
            }
        }
       
        for(int i=0;i<board.length;i++){
            for(int j=0; j<board[i].length;j++){
                board[i][j]=res[i][j];
            }
        }
        
    }
    
    public int checkAliveNeigh(int[][]grid, int i , int j){
        int res =0; 
        if(i+1<grid.length && grid[i+1][j]==1){
            res++;
        }
        
        if(i-1>=0 && i-1<grid.length && grid[i-1][j]==1){
            res++;
        }
        
        if(j-1>=0 && j-1<grid[i].length && grid[i][j-1]==1){
            res++;
        }
        if(j+1<grid[i].length && grid[i][j+1]==1){
            res++;
        }
        
        //diagonal now 
        
        if(i+1<grid.length && j-1>=0 && j-1<grid[i].length && grid[i+1][j-1]==1){
            res++;
        }
        
        
        if(i+1<grid.length && j+1<grid[i].length && grid[i+1][j+1]==1){
            res++;
        }
        
        if(i-1>=0 && j-1>=0 && j-1<grid[i].length && i-1<grid.length && grid[i-1][j-1]==1){
            res++;
        }
        
        
        if(i-1>=0 &&  i-1<grid.length && j+1>=0 && j+1<grid[i].length && grid[i-1][j+1]==1){
            res++;
        }
        
        return res;
    }
    
}