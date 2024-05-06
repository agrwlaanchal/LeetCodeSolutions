class Solution {
    public int removeDuplicates(int[] nums) {
        
        int index =1;
        for(int i=1;i<nums.length; i++){
            
            if(nums[i]!=nums[index-1]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            }
            
        }
        return index;
        
    }
}