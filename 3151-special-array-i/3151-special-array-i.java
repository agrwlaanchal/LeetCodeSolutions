class Solution {
    public boolean isArraySpecial(int[] nums) {
     
        for(int i=0; i<nums.length;i++){
            
            if(i+1<nums.length){
                
                if((nums[i]%2==0 && nums[i+1]%2==0) || (nums[i]%2!=0 && nums[i+1]%2!=0) ){
                    return false;
                }
                
            }
        }
        return true; 
        
    }
}