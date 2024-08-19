class Solution {
    public int minSteps(int n) {
       
        //given 
         if (n == 1) return 0;
        
        // this problem is based on prime factors
        // we keep checking if n is divide by prime factor
        // if yes, add the factor to res sum and keep decreasing the number to n/factor
        
        
        int steps = 0;
        int factor = 2;
        
        while (n > 1) {
            while (n % factor == 0) {
                steps += factor;
                n /= factor;
            }
            factor++;
        }
        
        return steps;
        
    }
}