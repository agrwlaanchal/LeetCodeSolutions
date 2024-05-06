class Solution {
    public int removeDuplicates(int[] nums) {
     
        if(nums.length<=2){
            return nums.length;
        }
        
        int index =2;
        for(int i=2;i<nums.length; i++){
            
            if(nums[i]!=nums[index-1]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            }else if(nums[i]!=nums[index-2]){
                  int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            }
            
        }
        return index;
        
        
        
    }
}