class Solution {
    public long largestPerimeter(int[] nums) {
 
        Arrays.sort(nums);
        
        long presum[]=new long[nums.length];
        
        presum[0] = nums[0];
        presum[1]=nums[0]+nums[1];
        long  ans = presum[1];
        for(int i=2; i<nums.length;i++){
            if(nums[i]<presum[i-1]){
                
                ans=presum[i-1]+nums[i];
                
            }
            presum[i] = presum[i-1]+nums[i];
        }
        
        if(ans==presum[1]){
            return -1;
        }
        return ans; 
        
    }
}