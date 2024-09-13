class Solution {
    public String lastNonEmptyString(String s) {
        
       HashMap<Character, Integer> hmap =new HashMap<>();
        int max= 0 ;
        
        for(int i=0;i<s.length();i++){
            
            char c = s.charAt(i);
            if(hmap.containsKey(c)){
                hmap.put(c, hmap.get(c)+1);
            }else{
                hmap.put(c,1);
            }
            max=Math.max(max, hmap.get(c));
            
        }
        
        
       /* HashMap<Character, Integer> temp =new HashMap<>();
        
        for(Map.Entry<Character, Integer> entry: hmap.entrySet()){
            
            if(entry.getValue()==max){
                temp.put(entry.getKey(), 1);
                //hmap.remove(entry.getKey());
            }
        }*/
        
        StringBuilder sb = new StringBuilder();
        boolean []visited = new boolean[26];
        
        for(int i=s.length()-1;i>=0;i--){
            
            char c = s.charAt(i);
            if(hmap.containsKey(c) && hmap.get(c)==max &&!visited[c-'a']){
                sb.append(c);
                visited[c-'a']=true;
            }
        }
        
        return sb.reverse().toString();
        
        
    }
}