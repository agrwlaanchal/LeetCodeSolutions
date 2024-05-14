class Solution {
    public int[] singleNumber(int[] nums) {
        
        
        
        int xor =0;
        
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        
        //we have xor of two numbers 
         
        // now if xor again with these numbers and it decreases the value. 
         xor = xor & ~(xor-1);
        int bit = (int)(Math.log(xor)/Math.log(2));
        
        int num1 = 0;
        int num2 = 0;
        
        for(int i=0; i<nums.length;i++){
            if((nums[i] & (1<<bit)) > 0) num1 ^= nums[i];
            else num2 ^= nums[i];
        }

        return new int[] {num1,num2};
        
        
    }
}