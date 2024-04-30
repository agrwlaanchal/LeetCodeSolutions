class Solution {
    public long wonderfulSubstrings(String word) {
        // checked the solution because of bit mask. 
        
         Map<Integer, Integer> freq = new HashMap<>();
        int mask = 0;
         freq.put(0, 1);
        long res = 0L;
         for (int i = 0; i < word.length(); i++) {
         
            char c = word.charAt(i);
             int bit = c -'a';
             mask ^= (1 << bit);
             res += freq.getOrDefault(mask, 0);
            
             freq.put(mask, freq.getOrDefault(mask, 0) + 1);
             
             for (int odd_c=0; odd_c < 10; odd_c++) {
                res += freq.getOrDefault(mask ^ (1 << odd_c),0);
            }
         }
        
        return res;
        
    }
}