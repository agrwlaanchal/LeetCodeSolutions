class Solution {
     int res =0;
    public int getMaximumGold(int[][] grid) {
     
        int m = grid.length;
        int n = grid[0].length;
        
        //int sum =grid[0][0];
       
        for(int i=0;i<grid.length;i++){
             int sum =0;
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]>0){
                    checkmax(grid, i, j, m, n, sum);
                }
            }
        }
        
        return res;
        
        
    }
    
    public void checkmax(int[][]grid, int i, int j, int m , int n, int sum){
        
        
        if(i>=m && j>=n){
            //res=Math.max(res,sum);
            return ; 
        }
        
       // System.out.print(grid[i][j]+" ");
        sum=sum+grid[i][j];
        int temp = grid[i][j];
        grid[i][j]=0;
        res=Math.max(sum, res);
        
        
        if(issafe(i-1, j, grid)){
            checkmax(grid, i-1, j, m,n, sum);
        }
        
        if(issafe(i+1, j, grid)){
            checkmax(grid, i+1, j, m,n, sum);
        }
        if(issafe(i, j+1, grid)){
            checkmax(grid, i, j+1, m,n, sum);
        }
        if(issafe(i, j-1, grid)){
            checkmax(grid, i, j-1, m,n, sum);
        }
        
        
        grid[i][j]=temp;
        
    }
    
    public boolean issafe(int i, int j, int [][]grid){
        
        if(i>=0&&i<grid.length && j>=0 && j<grid[0].length && grid[i][j]>0){
            return true;
        }
        return false; 
        
    }
    
}