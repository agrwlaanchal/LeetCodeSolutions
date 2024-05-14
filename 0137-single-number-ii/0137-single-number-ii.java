class Solution {
    public int singleNumber(int[] nums) {
     
        Arrays.sort(nums);
       System.out.println(Arrays.toString(nums));
        
        for(int i=2;i<nums.length;i=i+3){
            if(nums[i]!=nums[i-2]){
                //first and second element dont match. 
                return nums[i-2];
            }    
        }
        return nums[nums.length-1];
      
        
    }
}