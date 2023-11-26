class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        
     if(k>mat[0].length){
         
         int multi = k/mat[0].length;
     //    System.out.println("")
       //  System.out.println(" multi is "+ multi);
         k = k- (multi*mat[0].length);
         
         System.out.println(k);
     }
        
        
        for(int i=0; i<mat.length ; i++){
            
            
            if(i%2==0){
                
                int []temp = leftshift(mat[i], k);
                    System.out.println(Arrays.toString(temp));
                    for(int j=0;j<temp.length;j++){
                        
                        if(temp[j] != mat[i][j]){
                            return false;
                        }
                        
                    }
            }else{
                
                int []temp = rightshift(mat[i], k);
                 System.out.println(Arrays.toString(temp));
                for(int j=0;j<temp.length;j++){
                        
                        if(temp[j] != mat[i][j]){
                            return false;
                        }
                        
                    }
                
            }
        }
        
        return true; 
        
    
        
    }
    
    
    
    public int[] leftshift(int []mat , int k){
        
        System.out.println("printing1 "+Arrays.toString(mat));
        System.out.println("k is "+k);
        int []res = new int[mat.length];
        int index =0 ;
        for(int i=k;i<mat.length;i++){
            res[index++] = mat[i];
        }
         System.out.println("printing "+Arrays.toString(res));
        for(int i=0; i<k; i++){
            res[index++] = mat[i];
        }
        
        return res;
    }
    
    public int[] rightshift(int []mat, int k){
        
         int []res = new int[mat.length];
         int index =k;
       
    
       for(int i=0;i<mat.length-k; i++ ){
            res[index++] = mat[i];
        }
        
        
        
        int j=0 ;
        for(int i=mat.length-k; j<k; i++ ){
            
            res[j] = mat[i];
            j++;
        }
        
       
        return res;
    }
    
    
}