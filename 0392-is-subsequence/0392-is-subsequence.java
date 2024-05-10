class Solution {
    public boolean isSubsequence(String s, String t) {
     
        
        for(int i=0;i<s.length();i++){
            
            char c = s.charAt(i);
            int index=t.indexOf(c);
            if(index==-1){
                return false;
            }else{
                t = t.substring(index+1);
            }
            
        }
        return true; 
        
        
    }
}