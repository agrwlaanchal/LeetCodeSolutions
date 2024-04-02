class Solution {
    public boolean isIsomorphic(String s, String t) {
     
     
        
        HashMap<Character, Character> hmap = new HashMap<>();
        
        if(s.length()!=t.length()){
            return false;
        }
        
        for(int i=0;i<s.length(); i++){
            
            char charc = s.charAt(i);
            char chart = t.charAt(i);
            
           // System.out.println(charc+" "+chart);
            
            if(hmap.containsKey(charc)){
                if(hmap.get(charc)!=chart){
                   return false;
                }
            }else {
               // System.out.println("added charc "+charc +" to map");
                if(hmap.values().contains(chart)){
                    return false;
                }
                hmap.put(charc, chart);
            }
            
            
            
        }
        return true; 
        
    }
}