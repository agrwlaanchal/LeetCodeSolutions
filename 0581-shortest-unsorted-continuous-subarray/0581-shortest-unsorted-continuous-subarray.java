
/*
 int end = -2 , max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            max = Math.max(max,nums[i]);
            if(nums[i] < max){
                end = i;
            }
        }

        int begin = -1 , min = Integer.MAX_VALUE;

        for(int i = nums.length - 1; i >= 0; i--){
            min = Math.min(min,nums[i]);
            if(nums[i] > min){
                begin = i;
            }
        }
        return end - begin + 1;
*/

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        // need to find 3 points 
        // 1 min
        // 3 min
        //2 max
        
        // find max and number after max which is smaller    
        // find max and go left, where nums[i]<nums[i-1]
        
        int max = Integer.MIN_VALUE;
        int end =-1;
        int endindex =-2;
        for(int i=0; i<nums.length;i++){
            
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<max){
                end=nums[i];
                endindex = i;
            }
            
        }
       
       // System.out.println(max+" "+end+" "+endindex);
        int start =-1;
        int min= Integer.MAX_VALUE;
        for(int i=nums.length-1; i>=0;i--){
            
            min = Math.min(min,nums[i]);
            if(nums[i]>min){
                start=i;
                
            }
        }
       // System.out.println(start+" "+endindex);
         return endindex-start+1;
       
        }
       
    
}