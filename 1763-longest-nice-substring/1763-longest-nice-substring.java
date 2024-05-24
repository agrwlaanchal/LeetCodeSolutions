class Solution {
    public String longestNiceSubstring(String s) {
        
        
        //uppercase letter 'A' is 65, while the lowercase letter 'a' has an ASCII value of 97
        
     int max =0; 
        String res ="";
        for(int i=0 ;i<s.length()-1;i++){
            for(int j=i+1; j<s.length();j++){
                
                String temp = s.substring(i, j+1);
                if(isnice(temp)){
                   if(temp.length()>max){
                       max= temp.length();
                       res=temp;
                   }
                }
                
            }
        }
        return res; 
        
        
    }
    
    public boolean isnice(String temp){
        
        
        int []l = new int[26];
        int []u = new int[26];
        Arrays.fill(l,0);
        Arrays.fill(u,0);
        
        for(int i=0;i<temp.length();i++){
            
            char c = temp.charAt(i);
            
            if(Character.isUpperCase(c)){
                u[c-'A']=1;
            }else{
                l[c-'a']=1;
            }
            
        }
        
        if(Arrays.equals(l,u)){
            return true;}
        return false;
        
    }
    
}