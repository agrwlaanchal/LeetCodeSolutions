class Solution {
    public boolean isAnagram(String s, String t) {
     
        
        
        int[]arr =new int[256];
        
        
        if(s.length()!=t.length())
            return false;
        
        for(int i=0; i<s.length();i++){
            
            char c = s.charAt(i);
            char u = t.charAt(i);
            arr[c]++;
            arr[u]--;
        }
        
        
        for(int i=0;i<256;i++){
            if(arr[i]!=0)
                return false;
        }
        
        return true; 
        
        
    }
}