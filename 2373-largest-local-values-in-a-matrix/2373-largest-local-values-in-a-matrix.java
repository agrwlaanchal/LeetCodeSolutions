class Solution {
    public int[][] largestLocal(int[][] grid) {
     
        int[][] res = new int[grid.length-2][grid.length-2];
        
        for(int i=1;i<grid.length-1;i++){
            for(int j=1; j<grid[i].length-1;j++){
                
                res[i-1][j-1]= getMin(grid, i,j);
                
                
            }
        }
        
        return res;
        
        
    }
    
    public int getMin(int[][]grid, int i, int j){
        
        int min =grid[i][j];
        
        if(min<grid[i-1][j-1]){
            min=grid[i-1][j-1];
        }
        
        if(min<grid[i-1][j]){
            min=grid[i-1][j];
        }
    
        if(min<grid[i-1][j+1]){
            min=grid[i-1][j+1];
        }
        
        if(min<grid[i][j-1]){
            min=grid[i][j-1];
        }
        if(min<grid[i][j+1]){
            min=grid[i][j+1];
        }
        if(min<grid[i+1][j-1]){
            min=grid[i+1][j-1];
        }
        if(min<grid[i+1][j]){min = grid[i+1][j];
                            }
        if(min<grid[i+1][j+1]){
            min=grid[i+1][j+1];
        }
        return min;
        
    }
    
    
}