class Solution {
    public int countHomogenous(String s) {
     
        
        int ans = 0 ;
        int prevcount = 0;
        int count1k = 0;
        char prev = s.charAt(0);
         int MOD = (int) 1e9 + 7;
        for(int i=0;i<s.length();i++){
            
            if(i==0 || s.charAt(i)==s.charAt(i-1)){
                prevcount++;       
                
            }else{
                //ccc , prevount = 3, prev = c 
               prevcount =1;
            }
            ans = (ans+prevcount) % MOD;
            
        }
        return ans; 
         
    }
}