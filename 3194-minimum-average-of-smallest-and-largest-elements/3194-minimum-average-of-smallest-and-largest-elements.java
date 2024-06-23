class Solution {
    public double minimumAverage(int[] nums) {
     
        
        double res =9999; 
        
        Arrays.sort(nums);
        
        int start=0;
        int end = nums.length-1;
        
        while(start<end){
            
            float num = nums[start]+nums[end];
            
            res=Math.min(res, num/2);
            
            start++;
            end--;
        }
        return res;
        
    }
}