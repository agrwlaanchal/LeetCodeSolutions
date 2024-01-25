class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length();
        int n = text2.length();
        
        return longestCommonSubsequence(text1, text2, m , n);
        
    }
     public int longestCommonSubsequence(String s1, String s2, int m, int n) {
         
           int[][] dp = new int[m+1][n+1];
         
         for(int i=0;i<=m; i++){
             dp[i][0] = 0;
         }
        for(int i=0;i<=n; i++){
             dp[0][i] = 0;
         }
         
        
         
         for(int i=1;i<=m;i++){
             for(int j=1;j<=n;j++){
                 
                 if(s1.charAt(i-1)==s2.charAt(j-1))
                 {
                     dp[i][j] = 1+dp[i-1][j-1];
                 }
                 else
                     dp[i][j] = Math.max(dp[i-1][j] ,  dp[i][j-1]);
                 
             }
         }
         
       
         return dp[m][n];
         
     
     }
}