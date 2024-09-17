class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        String[]str1 = s1.split(" ");
        String[]str2 = s2.split(" ");
        
        HashMap<String, Integer>hmap1 = new HashMap<>();
         HashMap<String, Integer>hmap2 = new HashMap<>();
        
            for(String st : str1){
                hmap1.put(st, hmap1.getOrDefault(st,0)+1);
            }
        
        /*HashSet<String> hset1 = new HashSet<>();
        for(Map.Entry<String, Integer> entry: hmap1.entrySet()){
            if(entry.getValue()==1){
                hset1.add(entry.getKey());
            }
        }*/
        
        // we have hashset of string coming once in str1
        
            for(String st : str2){
                hmap2.put(st, hmap2.getOrDefault(st,0)+1);
            }
        
        /*HashSet<String> hset2 = new HashSet<>();
        for(Map.Entry<String, Integer> entry: hmap2.entrySet()){
            if(entry.getValue()==1){
                hset2.add(entry.getKey());
            }
        }*/
        
        //hset 2 of string coming once in str2
         
        ArrayList<String> res =new ArrayList<>();
        
        for(Map.Entry<String, Integer> entry: hmap1.entrySet()){
            if(entry.getValue()==1 && !hmap2.containsKey(entry.getKey())){
                res.add(entry.getKey());
            }
        }
        
        for(Map.Entry<String, Integer> entry: hmap2.entrySet()){
            if(entry.getValue()==1 && !hmap1.containsKey(entry.getKey())){
                res.add(entry.getKey());
            }
        }
    
        
        
        String[]result =new String[res.size()];
        for(int i=0;i<result.length;i++){
            result[i] = res.get(i);
        }
        return result; 
        
        
        
        
    }
}