class Solution {
    public int minDifference(int[] nums) {
     
        
        // 0 1 5 10 14
        
         // last 3
        // first 3
        // start1 end 2
        // start2 end 1
        
        
        if(nums.length<=4){
            return 0;
        }
        
        Arrays.sort(nums);
        int n = nums.length-1;
        int min1 = nums[n]-nums[3];
        int min2 = nums[n-3]-nums[0];
        int min3= nums[n-2]-nums[1];
        int min4 = nums[n-1]-nums[2];
        
        return Math.min(min1, Math.min(min2, Math.min(min3,min4)));
            
        
    }
}