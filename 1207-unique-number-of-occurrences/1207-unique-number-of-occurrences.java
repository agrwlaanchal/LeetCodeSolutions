class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     
        HashMap<Integer, Integer> hmap  = new HashMap<>();
        
        for(int a: arr){
            
            if(hmap.containsKey(a)){
                hmap.put(a, hmap.get(a)+1);
            }else{
                hmap.put(a,1);
            }
            
        }
        
        HashSet<Integer> hset  =new HashSet<>();
        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
            
            if(hset.contains(entry.getValue()))
                return false;
            hset.add(entry.getValue());
            
        }
        return true;
        
    }
}