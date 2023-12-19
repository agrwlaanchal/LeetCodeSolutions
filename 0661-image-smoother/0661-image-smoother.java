class Solution {
    public int[][] imageSmoother(int[][] img) {
        
        
        int m = img.length;
        int n= img[0].length;
        
        int[][]res=new int[m][n];
        
        for(int i=0 ;i<m;i++){
            for(int j=0; j<n; j++){
                
                
                int count =0;
                int sum =0;
                
                
                if(check(i-1, j, m, n)){
                     sum=sum+img[i-1][j];
                    count++;
                }
                
                if(check(i+1, j,m, n)){
                    sum=sum+img[i+1][j];
                    count++;
                }
              
                if(check(i, j-1,m,n)){
                     sum=sum+img[i][j-1];
                    count++;
                }
                if(check(i, j+1, m, n)){
                   sum=sum+img[i][j+1];
                    count++;
                }
                
                if(check(i-1, j-1,m, n)){
                    sum=sum+img[i-1][j-1];
                    count++;
                }
                
                if(check(i-1, j+1, m, n)){
                    sum=sum+img[i-1][j+1];
                    count++;
                }
                
                if(check(i+1, j-1, m,n)){
                    sum=sum+img[i+1][j-1];
                    count++;
                }
                
                if(check(i+1, j+1, m ,n)){
                    sum=sum+img[i+1][j+1];
                    count++;
                }
                
                sum=sum+img[i][j];
                count++;
                
                res[i][j] = (int)Math.floor(sum/count);
                
            }
            
        }
        
        return res;
        
    }
    
    
    public boolean check(int i, int j, int m, int n){
        
        if(i>=0 && i<m && j>=0 && j<n){
            return true;
        }
        
        return false;
        
    }
    
    
    
    
}