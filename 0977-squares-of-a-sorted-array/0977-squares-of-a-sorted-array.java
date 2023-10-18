class Solution {
    public int[] sortedSquares(int[] nums) {
     
        int start = 0;
        int end = nums.length-1;
        
        int index = nums.length-1;
       int res[]=new int[nums.length]; 
        
        while(start<=end){
            
            if(Math.abs(nums[start])<= Math.abs(nums[end])){
                res[index] = nums[end]*nums[end];
                end--;
            }else{
                res[index] = nums[start]*nums[start];
                start++;
            }
            
            index--;
            
            
        }
        
        return res;
        
    }
}

