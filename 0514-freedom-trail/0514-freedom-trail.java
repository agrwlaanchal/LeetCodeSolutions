class Solution {
    public int findRotateSteps(String ring, String key) {
     
       int ptr =0 ; // ring
        int index =0; //key 
        int[][]dp = new int[key.length()+1][ring.length()+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        
  return solve(ring, key,ptr, index, dp);
       
        
    }
    
    
    public int solve(String ring, String key, int ptr, int index, int[][]dp){
        
        
        if(index>=key.length()){
            return 0;
        }
        
        if(dp[index][ptr]!=-1){
            return dp[index][ptr];
        }
        
        int step = Integer.MAX_VALUE;
        
        for(int i=0;i<ring.length();i++)
        {
            
            
            if(ring.charAt(i)==key.charAt(index)){
                
                step = Math.min(step, Math.min(Math.abs(i-ptr), ring.length()-Math.abs(i-ptr))+1+solve(ring, key, i, index+1,dp));
                
            }
            
        }
        
        return dp[index][ptr]=step;
        
        
    }
    
}