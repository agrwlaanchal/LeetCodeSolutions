class Solution {
    public int pivotIndex(int[] nums) {
     
        int totalsum = 0;
        for(int i=0;i<nums.length;i++){
            totalsum =totalsum+nums[i];
        }
        
        
        int curr = 0;
        for(int i=0;i<nums.length;i++){
            
            if(curr == totalsum - curr - nums[i]){
                return i;
            }
            curr=curr+nums[i];
            
        }
        return -1;
        
        
    }
}