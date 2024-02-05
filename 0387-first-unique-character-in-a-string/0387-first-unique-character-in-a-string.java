class Solution {
    public int firstUniqChar(String s) {
     
       
     HashMap<Character, Integer> hmap = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hmap.containsKey(c)){
                hmap.put(c, hmap.get(c)+1);
            }else{
                hmap.put(c,1);
            }
            
        }
        
        
        for(int i=0;i<s.length();i++){
             char c = s.charAt(i);
            if(hmap.get(c)==1){
                return i;
            }
        }
        
        return -1;
    }
}