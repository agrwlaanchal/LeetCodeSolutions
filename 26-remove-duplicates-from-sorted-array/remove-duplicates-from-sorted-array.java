class Solution {
    public int removeDuplicates(int[] nums) {
        
        int index =0;
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]!=nums[index]){
                nums[index+1]=nums[i];
                index++;
            }
            
        }
        
        //System.out.println(Arrays.toString(nums));
        return index+1;
        
    }
}