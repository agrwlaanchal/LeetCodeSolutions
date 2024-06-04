class Solution {
    public int longestPalindrome(String[] words) {
      
   
        HashMap<String,Integer> hmap = new HashMap<>();
        int res=0;
        for(String word: words){
            
            String temp = ""+word.charAt(1)+word.charAt(0);
      //      System.out.println("temp is "+temp +" word is "+word);
            if(hmap.containsKey(temp)){
        //     System.out.println("map contains temp");
                res=res+4;
                hmap.put(temp, hmap.get(temp)-1);
                if(hmap.get(temp)==0){
                    hmap.remove(temp);
                }
              
            }else{
          //      System.out.println("map does not contains temp");
                 if(hmap.containsKey(word)){
                     hmap.put(word, hmap.get(word)+1);
                 }else{
                     hmap.put(word, 1);
                 }
              
            }
            
        }
        
        
       int max = -1;
       for(Map.Entry<String, Integer> entry: hmap.entrySet()){
           if(ispalin(entry.getKey())){
               max=Math.max(entry.getValue(), max);
           }
       }
        
        if(max!=-1){
            return res+max*2;
        }
        return res; 
        
        
    }
    
    
    private boolean ispalin(String word){
      
        return word.charAt(0)==word.charAt(1);
    }
   
    
    
}
