class Solution {
    public int appendCharacters(String s, String t) {
        
        
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            int index = s.indexOf(c);
            
            if(index==-1){
                return t.length()-i;
            }else{
                s = s.substring(index+1);
            }
            //System.out.println(c+" "+s);
        }
        
        return 0; 
        
       
        
    }
}