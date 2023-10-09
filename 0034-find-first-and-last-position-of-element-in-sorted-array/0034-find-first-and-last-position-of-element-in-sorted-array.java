class Solution {
    public int[] searchRange(int[] nums, int target) {
     
        
     int start=0;
     int end = nums.length-1;
        
        
        int res[] = new int[2];
        res[0]=-1;
        res[1] =-1;
        
    while(start <= end ){
        
        
        int mid = start+ (end-start)/2;
        
      //  System.out.println(mid);
        if(nums[mid]==target && (mid==0 || nums[mid-1]!=target)){
            res[0] = mid; 
            break;
        } else if(nums[mid]>=target){
            end= mid-1;
        }else{
            start=mid+1;
        }
        
        
    }
        
        
        start=0;
        end = nums.length-1;
        
        while(start<=end){
            
            int mid = start+ (end-start)/2;
            
           if(nums[mid]==target && (mid==nums.length-1 || nums[mid+1]!=target)){
               res[1]= mid;
               break;
           } else if(nums[mid]<=target){
               start = mid+1;
           }else{
               end = mid-1;
           }
            
            
        }
        
        
        return res;
        
    }
}