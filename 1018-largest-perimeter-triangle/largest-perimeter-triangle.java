class Solution {
    public int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        int ans =0; 
        for(int i=nums.length-1; i>=2; i--){

            int side1 = nums[i];
            if(side1 <(nums[i-1]+nums[i-2])){
                    ans = Math.max(ans, side1+nums[i-1]+nums[i-2]);
            }

        }
        return ans;
    }
}