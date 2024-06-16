class Solution {
    public long countCompleteDayPairs(int[] hours) {
        
        long res =0;
        
      
       
        HashMap<Integer, Integer> hmap= new HashMap<>();
        for(int num: hours){
            
             int remainder = num % 24;
             int complement = (24 - remainder) % 24;   
             if (hmap.containsKey(complement)) {
                res += hmap.get(complement);
            }
            hmap.put(remainder, hmap.getOrDefault(remainder, 0) + 1);
            
        }
        
        return res;
    }
}