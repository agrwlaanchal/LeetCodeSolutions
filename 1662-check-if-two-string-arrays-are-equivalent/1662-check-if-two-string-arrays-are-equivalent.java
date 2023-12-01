class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
     
        
  //   
        String temp1="";
        
        for(int i=0; i<word1.length ; i++){
            temp1 = temp1+word1[i];
        }
        
         String temp2="";
        
        for(int i=0; i<word2.length ; i++){
            temp2 = temp2+word2[i];
        }
        
        
        
       if(temp1.length()!=temp2.length())
           return false;
        
        for(int i=0;i<temp1.length();i++){
            
            if(temp1.charAt(i)!=temp2.charAt(i))
                return false;
        }
        
        return true;
      
        
        
    }
}