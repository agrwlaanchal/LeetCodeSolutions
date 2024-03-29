class Solution {
    public long countSubarrays(int[] nums, int k) {
        
     
        int maxel =nums[0];
        long ans =0; 
        int start =0; 
        int maxeleinwindow =0;  //store the freq of maxel in current window 
        
        for(int i=1; i<nums.length;i++){
            if(nums[i]>maxel){
                maxel= nums[i];
            }
        }
        
        // we got max element 
        
    // 1,3,2,3,3 
        
        // maxele. =3 
    
        for(int end =0 ; end<nums.length;end++){
            
            if(nums[end]==maxel){
                maxeleinwindow++;
            }
            //shrink the window 
            while(maxeleinwindow==k){
                if(nums[start]==maxel){
                    maxeleinwindow--;
                   
                }
                 start++;
            }
            //System.out.println("nums "+nums[end]+" "+start+"maxeleinwindow "+maxeleinwindow);
           //start of valid subarrays. 
            ans=ans+start;
            
        }
        return ans;
        
        
    }
}