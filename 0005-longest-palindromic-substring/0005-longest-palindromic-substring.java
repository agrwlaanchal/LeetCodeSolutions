class Solution {
    int resLen;
    int resStart; 
    public String longestPalindrome(String s) {
        
        
        int strLen = s.length();
        if(strLen <2)
            return s;
        
        for(int start=0;start<strLen; start++){
            expandRange(s, start, start);
            expandRange(s, start, start+1);
            
        }
        
        return s.substring(resStart, resStart+resLen);
        
        
    }
    
    private void expandRange(String s, int start, int end){
        
        
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        
        if(resLen< end-start-1){
            resLen = end-start-1;
            resStart = start+1;
        }
        
    }
    
    
}