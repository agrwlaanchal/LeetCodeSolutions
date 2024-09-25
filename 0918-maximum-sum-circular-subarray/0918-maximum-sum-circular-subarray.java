class Solution {
    public int maxSubarraySumCircular(int[] nums) {
     
        int arrsum =0;
        int currsum = findMax(nums);
        if(currsum<0)
            return currsum;
        
        for(int i=0;i<nums.length;i++){
            arrsum=arrsum+nums[i];
            nums[i]=-1*nums[i];
        }
        
        int circularsum = arrsum+findMax(nums);
      //  System.out.println(currsum +" "+currsum);
        return Math.max(currsum, circularsum); 
        
        
    }
    
    private int findMax(int[]nums){
        int currSum = nums[0];
        int res = nums[0];
        
        for(int i=1;i<nums.length;i++){
            currSum = Math.max(currSum+nums[i], nums[i]);
            res= Math.max(res,currSum);
        }
        return res; 
    }
    
}