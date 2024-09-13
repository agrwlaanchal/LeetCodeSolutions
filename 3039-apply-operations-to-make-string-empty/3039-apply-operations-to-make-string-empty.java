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
        
        
        ArrayList<Character> temp =new ArrayList<>();
        
        for(Map.Entry<Character, Integer> entry: hmap.entrySet()){
            
            if(entry.getValue()==max){
                temp.add(entry.getKey());
              //  hmap.remove(entry.getKey());
            }
        }
        
        StringBuilder sb = new StringBuilder();
       
        
        for(int i=s.length()-1;i>=0;i--){
            
            char c = s.charAt(i);
            if(temp.size()<=0)
                break; 
            if( temp.contains(c)  ){
                sb.append(c);
               temp.remove(Character.valueOf(c));
            }
        }
        
        return sb.reverse().toString();
        
        
    }
}