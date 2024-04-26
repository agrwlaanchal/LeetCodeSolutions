class Solution {
    public int minFallingPathSum(int[][] grid) {
        
        
        int[][]matrix = new int[grid.length][grid.length];
        
        for(int i=0; i<matrix.length;i++){
            matrix[0][i]= grid[0][i];
        }
        
        for(int i=1;i<matrix.length ;i++){
            for(int j=0; j<matrix[i].length;j++){
                
                int min = Integer.MAX_VALUE;
                
                int row =i-1;
                for(int k=0;k<matrix[i].length;k++){
                    
                    if(k!=j ){
               //         System.out.println(j+" "+k);
                        min =Math.min(min, matrix[row][k]);
                    }
                    
                    
                }
                matrix[i][j] = min+grid[i][j]; 
                
            }
           // System.out.println(Arrays.toString(matrix[i]));
        }
        
        int res = Integer.MAX_VALUE;
        for(int i=0; i<grid.length;i++){
         res=Math.min(res, matrix[grid.length-1][i]);   
        }
        return res;
        
        
    }
}