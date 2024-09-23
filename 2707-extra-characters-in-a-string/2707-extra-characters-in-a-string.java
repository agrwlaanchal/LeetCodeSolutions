class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        
        // convert dict to set
        HashSet<String> hset = new HashSet<>();
        for(String str: dictionary){
            hset.add(str);
        }
        
        int n = s.length();
        int[]dp = new int[n+1];
        
        for(int i = n-1; i>=0;i--){
            
            dp[i] = dp[i+1]+1;
            for(int end=i;end<n;end++){
                String sub =s.substring(i,end+1);
                if(hset.contains(sub)){
                    dp[i]= Math.min(dp[end+1], dp[i]);
                }
            }
        }
        
        return dp[0];
        
        
    }
}