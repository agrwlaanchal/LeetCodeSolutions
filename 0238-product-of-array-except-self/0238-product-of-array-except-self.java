class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[]dp1 = new int[nums.length];
        int[]dp2 = new int[nums.length];
        int[]res = new int[nums.length];
        
        dp1[0] = 1;
        dp2[nums.length-1]=1;
        
        for(int i=1; i<nums.length ;i++){
            dp1[i] = dp1[i-1]*nums[i-1];
        }
        
        for(int i=nums.length-2; i>=0; i--){
            dp2[i] = dp2[i+1]*nums[i+1];
            res[i]  = dp2[i]*dp1[i];
        }
        res[nums.length-1] = dp1[nums.length-1];
        
        return res; 
        
    }
}