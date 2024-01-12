class Solution {
    public boolean halvesAreAlike(String s) {
     
        int start =0;
        int end = s.length()-1;
        
        int v1 =0;
        int v2=0; 
        
        while(start<end){
        
            char c= s.charAt(start);
            
            if(isvowel(c)){
                v1++;
            }
            
            char t = s.charAt(end);
            if(isvowel(t)){
                v2++;
            }
            
            start++;
            end--;
            
        }
        
        if(v1==v2){
            return true;
        }
        return false;        
     
        
    }
    
    
    public boolean isvowel(char c){
        
        if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O'||c=='U')
            return true;
        
        return false;
        
    }
}