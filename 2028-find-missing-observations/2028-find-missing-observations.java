class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        
        //find sum of given rolls 
        int sum = 0;
        for(int roll: rolls){
            sum=sum+roll;
        }
        
        // find the remaining sum we can assign to "n" rolls 
        int diff = mean*(rolls.length+n) - sum;
        
   
        // check boundary conditions: 1. if diff is less than "n": no answer possible     
        if(diff<n)
            return new int[0];
        
        //2. if we diff > n*6 i.e. diff>0 even if all rolls get 6 : no answer possible
        if(diff>n*6){
            return new int[0];
        }
        
        
        // create result array and assign 1 to each roll initially
        // decrease the remaining sum "diff" by n 
        int[]res = new int[n];
        Arrays.fill(res,1);
    
         diff=diff-n;
    
        //while diff>0, keep increasing value of each roll
        while (diff > 0) {
             for (int i = 0; i < n && diff > 0; i++) {
                res[i]++;
                diff--;
            }
        }
        
        //return result array once remaining sum is 0
        return res; 
        
    }
}