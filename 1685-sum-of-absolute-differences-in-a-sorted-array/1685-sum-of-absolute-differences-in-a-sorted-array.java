class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
     
        
        int[]prefix = new int[nums.length];
  
        
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        
        
        int[]res = new int[nums.length];
        
        for(int i=0; i<nums.length ; i++){
            
            
            int leftcount = i;
            int rightcount = nums.length-i-1;
            
            int leftsum = prefix[i] - nums[i];
            int rightsum = prefix[nums.length-1] - prefix[i];
            
            
            int lefttotal = leftcount*nums[i] - leftsum;
            int righttotatl = rightsum - rightcount*nums[i];
            
            res[i] = lefttotal + righttotatl; 
            
            
        }
        
        return res; 
        
        
    }
}