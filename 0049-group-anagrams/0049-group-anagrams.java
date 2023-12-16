class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
        
        
        HashSet<String> hset = new HashSet<>();
          HashMap<String, ArrayList<String>> hmap = new HashMap<>();
        
        for(String str: strs){
            char tempArray[] = str.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
            String key = new String(tempArray);
        hset.add(key) ;
        
            if(hmap.containsKey(key)){
                
                ArrayList<String> arr = hmap.get(key);
                arr.add(str);
                hmap.put(key, arr);
            }else{
                 ArrayList<String> arr = new ArrayList<>();
                arr.add(str);
                hmap.put(key, arr);
            }
        }
        
        
        List<List<String>> res = new ArrayList<>();
        
        for(Map.Entry<String,ArrayList<String>> entry: hmap.entrySet()){
            res.add(entry.getValue());
        }
        
        return res; 
        
        
      
        
    }
}