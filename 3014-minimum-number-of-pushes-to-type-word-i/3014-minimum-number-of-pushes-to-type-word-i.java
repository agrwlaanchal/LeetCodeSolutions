class Solution {
    public int minimumPushes(String word) {
      
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch  = word.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch,0)+1);
        }
        
        Map<Character, Integer> sortedMap = sortByCount(hmap);
        
        int mapto = 1;
        int count =0; 
        HashMap<Character, Integer> resmap = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
         //   System.out.println(entry.getKey() + " -> " + entry.getValue()+" "+mapto);
            
            resmap.put(entry.getKey(), mapto);
            count++;
            if(count>=8){
                mapto++; 
                count=0;
            }
            
        }
        int sum =0; 
        for(int i=0; i<word.length();i++){
            sum=sum+resmap.get(word.charAt(i));
        }   
        
        return sum; 
        
        
    }
    
    public static Map<Character, Integer> sortByCount(HashMap<Character, Integer> map) {
        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (entry1, entry2) -> entry2.getValue() - entry1.getValue()); // Descending order

        Map<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
    
    
    
}