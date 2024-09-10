class Solution {
    public int[] applyOperations(int[] nums) {
        //apply first operation
        
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
            
        }
        
        //shift 0s to end
        int index =0; 
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
            
        }
        
       // System.out.println(Arrays.toString(nums));
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
        
        //System.out.println(Arrays.toString(nums));
        
        return nums;
        
        
    }
}