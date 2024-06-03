class Solution {
    public int jump(int[] nums) {
        
        
    int[]dp=new int[nums.length];
    Arrays.fill(dp, Integer.MAX_VALUE);
     
    dp[0]=0;
        
    for(int i=1;i<nums.length;i++){
        for(int j=0;j<i;j++){
            
            if(j+nums[j]>=i && nums[j]!=0){
                dp[i] = Math.min(dp[j]+1, dp[i]);
            }
            
        }
    }
        
 //       for(int i=0;i<dp.length;i++)
   //         System.out.print(dp[i]+" ");
        return dp[nums.length-1];
        
        
    }
}