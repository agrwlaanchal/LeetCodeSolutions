class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
      
        /*HashMap<String, Integer> hmap = new HashMap<>();
        for(String str: wordDict){
            hmap.put(str, 0);
        }
        
        String temp = "";
        
        //temp+add char and recursion
        
        return calculate(s, temp, 0, hmap);*/
        
        Set<String> wordSet = new HashSet<>(wordDict);
         boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;  // Empty string can be segmented
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; 
                }
             }
        }

        return dp[s.length()];
        
        
        
    }
    
    public boolean calculate(String s, String temp, int index , HashMap<String, Integer> hmap ){
        
        
        if(index==s.length()){
            if(hmap.containsKey(temp)){
                return true;
            }
        }else{
            temp=temp+s.charAt(index);
             if(hmap.containsKey(temp)){
                if(calculate(s,"", index+1, hmap)){
                    return true;
                }
             }
            return calculate(s,temp, index+1, hmap);
        }
        
                             return false;
        
    }
    
}