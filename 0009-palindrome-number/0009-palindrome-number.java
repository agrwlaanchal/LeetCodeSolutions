class Solution {
    public boolean isPalindrome(int x) {
 
        String temp = String.valueOf(x);
        int start=0; 
        int end = temp.length()-1;
        
        
        while(start<end){
            
            if(temp.charAt(start)!=temp.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        
        return true; 
        
    }
}