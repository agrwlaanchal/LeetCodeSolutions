class Solution {
    public int reductionOperations(int[] nums) {
 
       Arrays.sort(nums);
        
        int leftmost = nums.length; 
        int rightmost = nums.length-1;
        int max = nums[nums.length-1];
        int ops=0;
        while(nums[0]!=nums[nums.length-1]){
          leftmost = findleft(nums, max, nums.length );
          System.out.println(leftmost +" "+rightmost);
     
          
            
            if(leftmost>0){
                
                int secondmax = nums[leftmost-1];
              ops = ops+ rightmost-leftmost+1;
                nums[rightmost] = secondmax;
                
                max = secondmax;    
            } else if(leftmost==0 && nums[leftmost]!=nums[1]){
             
                ops = ops+nums.length-1;
                nums[nums.length-1] = nums[0];
            }
         
          
            
        }
        
        return ops;
    }
    
    
    public int findleft(int[] nums, int max , int n){
        
  
        int start = 0;
        int end = n;
        int index = n; 
        while(start<=end){
            
            int mid = start+(end-start)/2;
            
            if(mid==0 || max > nums[mid-1] && nums[mid]==max ){
                return mid;
            } else if(max > nums[mid]){
                start = mid+1;
            } else{
                end = mid-1;
            }
            
            
        }
        return -1;
        
        
    }
    
    
    
    
}