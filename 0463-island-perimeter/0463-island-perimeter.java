class Solution {
    public int islandPerimeter(int[][] grid) {
     
        int res =0;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0;j<grid[i].length;j++){
                
                if(grid[i][j]==1){
                    
                    res=res+4;
                    //left
                    if(i-1>=0 && grid[i-1][j]==1){
                        res=res-1;
                    }
                    
                    if(i+1<grid.length && grid[i+1][j]==1){
                        res=res-1;
                    }
                    
                    if(j-1>=0&& grid[i][j-1]==1){
                        res=res-1;
                    }
                    
                    if(j+1<grid[i].length && grid[i][j+1]==1){
                        res=res-1;
                    }
                    
                }
                
            }
        }
        return res;
        
        
    }
}