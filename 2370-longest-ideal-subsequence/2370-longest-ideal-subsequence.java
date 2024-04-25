class Solution {
    public int longestIdealString(String s, int k) {
     
        
        int[] dp = new int[26];
        int maxLength = 0;

        //iterate over each character in s
        for (char c : s.toCharArray()) {
            // calcualte the alphabetical index
            int index = c - 'a';
            int maxLen = 0;
            //loop through index-k to index+k positions, updating the maxLen 
            for (int i = Math.max(0, index - k); i <= Math.min(25, index + k); i++) {
                maxLen = Math.max(maxLen, dp[i]);
            }
            //add length of the current character at the index
            dp[index] = maxLen + 1;
            //update the maxLength so far
            maxLength = Math.max(maxLength, dp[index]);
        }

        return maxLength;  
        
        
    }
}