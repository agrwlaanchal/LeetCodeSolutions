class Solution {
    public int lengthOfLIS(int[] nums) {
     
        int lis[] = new int[nums.length];
        
        lis[0]=1;
        int res=1; 
        
        for(int i=1;i<nums.length;i++){
            int temp = 1;
            
            for(int j=0;j<i;j++){
            
                if(nums[j]<nums[i]){
                    temp=Math.max(temp, lis[j]+1);                
                }    
            }
            lis[i]=temp;
            res=Math.max(lis[i], res);
        }
        
        return res; 
        
    }
}