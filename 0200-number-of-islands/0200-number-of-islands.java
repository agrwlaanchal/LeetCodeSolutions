class Solution {
    
    public int numIslands(char[][] grid) {
        
      boolean [][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i<visited.length;i++){
            Arrays.fill(visited[i], false);
        }
        
        int count =0 ;
        for(int i=0;i<grid.length;i++){
            for(int j=0; j<grid[i].length;j++){
                
                if(grid[i][j]=='1' && visited[i][j]==false){
                    count++;
                    dfsrecursive(i, j, grid, visited);
                    
                }
                
                
            }
        }
        
        return count;
        
    }

    
    public void dfsrecursive(int i, int j, char[][]grid, boolean[][]visited){
        
        visited[i][j]=true;
        
       if(i+1 < grid.length &&  !visited[i+1][j] && grid[i+1][j]=='1')
           dfsrecursive(i+1, j, grid, visited);
           
       if(j+1 < grid[i].length &&  !visited[i][j+1] && grid[i][j+1]=='1')
           dfsrecursive(i,j+1, grid, visited);
          
        
         if(i-1>=0 &&  !visited[i-1][j] && grid[i-1][j]=='1')
             dfsrecursive(i-1, j, grid, visited);
        
       if(j-1 >=0 &&  !visited[i][j-1] && grid[i][j-1]=='1')
           dfsrecursive(i, j-1, grid, visited);
           
        
    }
    
    
}