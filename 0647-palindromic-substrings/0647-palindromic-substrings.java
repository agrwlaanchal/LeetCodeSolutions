class Solution {
    public int countSubstrings(String s) {
        
        int n = s.length();
        
        boolean[][]palin = new boolean[n][n];
        int ans =0 ;
        
        //for length 1
        for(int i=0 ; i<n;i++){
            palin[i][i] = true;
            ans++;
        }
        
        //for length2
        for(int i=0 ; i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                palin[i][i+1]=true;
                ans++;
            }
        }
        
        
        //for length 3
        // remember formula 
        // f(a,b) = if (a==b) if a+1 and b-1 equals :  palin else not 
        // f (a,b) = a !=b , not palin 
        
        
        for(int len=3; len<=n;len++){
            
            for(int i=0;i<n-len+1;i++){
                
                if(s.charAt(i)==s.charAt(i+len-1) && palin[i+1][i+len-2]){
                    palin[i][i+len-1]=true;
                    ans++;
                }
                
            }
            
        }
        
        return ans; 
        
        
    }
}