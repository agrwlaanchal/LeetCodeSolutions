class Solution {
    public boolean isUgly(int n) {
        
      //find all the factors
        // check if prime 
        // and > 5 
         
        if(n==Integer.MIN_VALUE || n==Integer.MAX_VALUE){
            return false;
        }
        if(n<=0){
            return false;
        }
        
        for(int i=1; i*i<=n;i++){
            
            if(n%i==0){
               if(prime(i)&& i>5){
                   return false;
               }
                if(n/i!=i){
                    if(prime(n/i) && (n/i)>5){
                        return false;
                    }
                }
                
            }
            
        }
        return true;
        
    }
    
    public boolean prime(int n){
        
        if(n==1){
            return false;
        }
        
        if(n==2||n==3){
            return true;
        }
        
        if(n%2==0||n%3==0){
            return false;
        }
        
        
        for(int i=5; i*i<=n; i=i+6){
            
            
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
            
        }
        return true; 
        
    }
    
}