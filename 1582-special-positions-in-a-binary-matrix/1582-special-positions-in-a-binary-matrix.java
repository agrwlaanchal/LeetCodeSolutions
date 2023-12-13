class Solution {
    public int numSpecial(int[][] mat) {
     
        int m  = mat.length;
        int n = mat[0].length; 
        
        int count=0; 
        for(int i=0; i<mat.length;i++){
       outer:     for(int j=0; j<mat[i].length;j++){
               
           if(mat[i][j]==1){
                    
                    //check row
                    for(int index=0;index<i; index++){
                        if(mat[index][j]!=0)
                            continue outer;
                    }
                    for(int index=i+1;index<m;index++){
                        if(mat[index][j]!=0)
                             continue outer;
                    }
                    
                    //check column 
                    for(int col=0;col<j;col++){
                        if(mat[i][col]!=0)
                             continue outer;
                    }
                    
                    for(int col=j+1; col<n; col++){
                         if(mat[i][col]!=0)
                             continue outer;
                    }
                    
                    count++;
                    
                }
            }
        }
        
        return count; 
        
    }
}