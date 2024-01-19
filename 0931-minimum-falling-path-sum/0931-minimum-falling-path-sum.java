class Solution {
    public int minFallingPathSum(int[][] matrix) {
   
        
        int[][]res = new int[matrix.length][matrix.length];
        
        for(int i=0;i<matrix.length;i++){
            Arrays.fill(res[i],0);
        }
        
        for(int i=0;i<matrix.length;i++){
            res[matrix.length-1][i]=matrix[matrix.length-1][i];
        }
        
        /*for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }*/
        
        
        for(int i=matrix.length-2; i>=0;i--){
            
            for(int j=0;j<matrix.length;j++){
                res[i][j] = matrix[i][j]+ checkVal(res, i, j);
               // System.out.println("i j res[][] "+i+" "+j+" "+res[i][j]);
            }
            
            
        }
        
        int result = res[0][0];
        for(int i=1;i<matrix.length;i++){
            result= Math.min(result,res[0][i] );
        }
        
        return result;
        
        
    }
    
    public int checkVal(int[][]matrix, int i, int j){
        
        
       int min = matrix[i+1][j];
        
        if(j-1>=0){
            min= Math.min(min, matrix[i+1][j-1]);
        }
        
        if(j+1<matrix.length){
            min = Math.min(min, matrix[i+1][j+1]);
        }
        
        return min; 
        
    }
    
    
    
    
    
    
}