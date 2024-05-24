class Solution {
    public int longestNiceSubarray(int[] nums) {
        
    
        int max = 1;
        int start =0 ;
        int end =1;
     outer:  while(end<nums.length){
           
            for(int i=start;i<end;i++){
                
                if((nums[i]&nums[end])!=0){
                    max = Math.max(end-start, max);
                    start = i+1;
                    continue outer;
                }
            }
         end++;
            
        }
        max = Math.max(end-start, max);
        return max; 
        
    
    }
}