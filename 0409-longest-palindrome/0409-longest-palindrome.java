class Solution {
    public int longestPalindrome(String s) {
     
        
        
        // all letters with freq %2==0 
        // only 1 letter with count 1 
        
        int[]res =new int[256];
        Arrays.fill(res, 0);
        int maxoddcount =0 ;
        char oddchar =0; 
        for(int i=0;i<s.length();i++){
            
            char c = s.charAt(i);
            res[c-65]++;
            
            
        }
        
        
        for(int i=0; i<256; i++){
            
           if(res[i]%2==1 && maxoddcount<res[i] ){
                maxoddcount=res[i];
                oddchar = (char)(65+i);
            }
            
        }
        
        int count =0;
        int count1 =0;
     
        for(int i=0;i<256;i++){
            
            if(res[i]>0 && res[i]%2==0){
                count=count+res[i];
            }else if(res[i]%2==1){
                
                if((char)(65+i)!=oddchar)
                count=count+res[i]-1;
                
            }
            
        }
        count=count+maxoddcount;
        return count;
        
    }
}