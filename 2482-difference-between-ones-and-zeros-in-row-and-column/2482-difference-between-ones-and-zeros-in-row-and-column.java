class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        
        // make 4 matrix 
        
        // for each row, count 1s
        
        int [] rows1 = new int[grid.length];
        for(int i=0; i<grid.length ;i++){
            int count =0 ;
            for(int j=0 ;j<grid[i].length ;j++){
                if(grid[i][j]==1){
                    count++;
                }
                rows1[i] = count; 
            }
            
        }
        
     //   System.out.println(Arrays.toString(rows1));
      //   System.out.println(Arrays.toString(rows0));
        int []col1 = new int[grid[0].length];
        
        
        for(int j=0;j<grid[0].length ;j++){
            
            int count =0 ;
            for(int i=0; i<grid.length ;i++){
                
                if(grid[i][j]==1){
                    count++;
                }
            }
            
            col1[j] = count;
        
            
        }
        
  //       System.out.println(Arrays.toString(col1));
   //      System.out.println(Arrays.toString(col0));
       
        
        int[][] res = new int[grid.length][grid[0].length];
        
        for(int i=0 ;i<res.length;i++){
            for(int j=0; j<res[i].length ;j++){
                
                res[i][j] = 2*rows1[i] + 2*col1[j] -grid.length - grid[0].length;
                
            }
        }
        
        
        return res;
    }
}