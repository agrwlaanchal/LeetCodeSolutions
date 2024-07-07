class Solution {
    public String getEncryptedString(String s, int k) {
     
        // d a r t d a r t d a r t 
        // s.length * k 
        
        int neededlength = s.length()*k+1;
        StringBuilder  t = new StringBuilder(s);
        
        while(t.length()<neededlength){
            t.append(t);
        }
        
        String temp = t.toString();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            
            res.append(temp.charAt(i+k));
        }
        
        return res.toString();
        
        
    }
}