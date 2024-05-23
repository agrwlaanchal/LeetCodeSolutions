import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
      
        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1; 
        }
        
        int start = 0;
        int end = 0; 
        
        HashMap<Character, Integer> hmap = new HashMap<>();
        
        int max = 0;
        while(end < s.length()){
            
            if(hmap.containsKey(s.charAt(end))){
                // Update start to the next index after the last occurrence
                start = Math.max(hmap.get(s.charAt(end)) + 1, start);
            }
            
            hmap.put(s.charAt(end), end);
            max = Math.max(end - start + 1, max);
            end++;
        }
        
        return max;
    }
}
