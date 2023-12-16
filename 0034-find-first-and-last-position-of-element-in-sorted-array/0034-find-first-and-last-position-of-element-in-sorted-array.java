class Solution {
    public int[] searchRange(int[] nums, int target) {
     
        
        //find leftmost 
        int leftmost= findleft(nums, target);
        System.out.println(leftmost);
        
        int rightmost = findright(nums, target);
        
        int[]res = new int[2];
        res[0]=leftmost;
        res[1]=rightmost;
        return res;  
        
    }
    
    
    public int findright(int[]nums, int target){
        
        int start=0;
        int end= nums.length-1;
        
        while(start<=end){
            
            int mid = (start+end)/2;
            System.out.println("mid is "+mid);
            if(nums[mid]==target){
                if(mid==nums.length-1 || nums[mid]!=nums[mid+1])
                    return mid;
                else
                    start=mid+1;
            } else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
        
    }
    
    
    public int findleft (int[]nums, int target){
        
        
        
        int start=0;
        int end = nums.length-1;
        
        
        while(start<=end){
            
            int mid = (start+end)/2;
            
            
            
            if(nums[mid]==target){
                if(mid==0 || nums[mid-1]!=nums[mid]){
                    return mid;
                }
                else{
                    end=mid-1;
                }
            } else if(nums[mid]<target){
                start=mid+1;
            } 
            else{
                end=mid-1;
            }
            
            
            
            
        }
        
        return -1;
        
    }
    
    
    
}