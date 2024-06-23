class Solution {
    public double minimumAverage(int[] nums) {
     
        
        double res =9999; 
        
        Arrays.sort(nums);
        
        int start=0;
        int end = nums.length-1;
        
        while(start<end){
            
            float num = nums[start]+nums[end];
            double t = num/2;
            res=Math.min(res, t);
            
            start++;
            end--;
        }
        return res;
        
    }
}