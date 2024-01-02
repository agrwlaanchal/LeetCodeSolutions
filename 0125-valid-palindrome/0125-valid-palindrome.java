class Solution {
    public boolean isPalindrome(String s) {
     
        s=s.toLowerCase();
      
        
        
            String temp="";
            for(int i=0; i<s.length();i++){
                if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                    temp=temp+s.charAt(i);
                }
            }
        
        
        System.out.println("temp is" + temp);
        int start=0;
        int end=temp.length()-1;
        
        
        while(start<=end){
            
            
            if(temp.charAt(start)!=temp.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true; 
        
    }
}