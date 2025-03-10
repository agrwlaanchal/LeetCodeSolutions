class Solution {
    public int maxArea(int[] height) {
      
        int start =0;
        int end = height.length-1;
        int res = 0;
        while(start<end){
            res= Math.max(res, Math.min(height[start], height[end])*(end-start));
            
            if(height[start]>height[end]){
                end--; //because we need max area so keeping large value
            }else{
                start++;
            }
            
        }
        return res;
        
    }
}