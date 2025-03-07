class Solution {
    public int[] closestPrimes(int left, int right) {
        int prev = 0;
        int curr = 0;
int res = -1;
int res1 = -1;
int res2 = -1;

        for(int i=left; i<=right;i++){
       // System.out.println("i is "+i);
            if(checkPrime(i)){
                    //System.out.println("prime number is "+i);
                    if(prev==0){
                        prev =i;
                    }else{
                            if(res==-1){
                               
                                res = i-prev; 
                                res1 = prev;
                                res2 = i;
                                prev = i;
                                 //System.out.println("res is "+res+" res2 "+res2+" res1 "+res1);
                            }else{
                                if(res>i-prev){
                                    res = i-prev;
                                    res1 =prev ; 
                                    res2= i;
                                }
                                    
                                   //  System.out.println("res is "+res+" res2 "+res2+" res1 "+res1);
                                
                                    prev = i; 
                                
                            }
                           // System.out.println("prev number is "+prev);
                    }

            }

        }

        int ans [] =new int[2];
        ans[0] = res1;
        ans[1] = res2; 
      return ans;
    }

    public boolean checkPrime(int n){
         if (n <= 1)
            return false;

        // Check if n is 2 or 3
        if (n == 2 || n == 3)
            return true;

        // Check whether n is divisible by 2 or 3
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        
        // Check from 5 to square root of n
        // Iterate i by (i+6)
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }


}