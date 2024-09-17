class Solution {
    public String decodeMessage(String key, String message) {
       
        HashMap<Character, Character> hmap =new HashMap<>();
        //String str = "abcdefghijklmnopqrstuvwxyz-hsdfjsjfdjskg";
        int num=97;
        for(int i=0; i<key.length();i++){
                
            char c = key.charAt(i);
            if(Character.isLetter(c) && !hmap.containsKey(c)){
               // System.out.println("c "+c+" num "+(char)num);
                hmap.put(c, (char)num);
                num++;
            }
            
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<message.length();i++){
            char c = message.charAt(i);
            
            if(Character.isLetter(c)){
                sb.append(hmap.get(c));
            }else{
                sb.append(c);
            }
        }
        
        return sb.toString();
        
        
    }
}