class Solution {
    public int minPairSum(int[] nums) {
     
        int max =0;
        
        Arrays.sort(nums);
        
        int start=0;
        int end = nums.length-1;
        
        while(start<end){
            int temp = nums[start] +nums[end];
            start++;
            end--;
            max = Math.max(temp, max);
        }
        
        return max;
        
        
    }
}