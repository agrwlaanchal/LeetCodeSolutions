class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        
        int len =1;
        int res=1; 
        for(int i=1;i<nums.length;i++){
            
            
            if(nums[i]>nums[i-1]){
               
                while(i<nums.length&&nums[i]>nums[i-1]){
                    len++;
                    i++;
                    
                }
                i--;
                
                res=Math.max(len,res);
                len=1;
            }else if(nums[i]==nums[i-1]){
                while(i<nums.length&&nums[i]==nums[i-1]){
                   
                    i++;
                    
                }
                i--;
            }else{
                
            
                
                while(i<nums.length&&nums[i]<nums[i-1]){
                    len++;
                    i++;
                }
                i--;
                res=Math.max(len,res);
                len=1;
            }
            
            
            
        }
       res=Math.max(len,res);
        return res;
        
        
        
    }
}