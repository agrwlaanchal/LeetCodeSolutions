class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        
        int n = grid.length; 
      //  int sum = (2*n*(2*n+1))/2;
        
       // System.out.println(sum );
        
        boolean visited[] =new boolean[n*n+1];
        
        int rep =0;
        int missing =0 ;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[i].length;j++){
                if(!visited[grid[i][j]]){
                visited[grid[i][j]] = true;
                }else{
                    rep = grid[i][j];
                }
            }
        }
        
        
        for(int i=1;i<visited.length; i++){
            
            if(!visited[i]){
                missing=i;
                break;
            }
        }
        
        
        int[]res=new int[2];
        res[0] = rep;
        res[1]=missing;
        
        return res; 
        
        
    }
}