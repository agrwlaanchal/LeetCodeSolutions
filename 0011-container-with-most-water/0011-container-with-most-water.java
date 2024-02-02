class Solution {
    public int maxArea(int[] height) {
        
    int res=0;
        
   /*     int maxheight = height[0];
         
        
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1; j<height.length;j++){
                
                if(height[j]<=maxheight){
                       res= Math.max(Math.min(height[i], height[j])*(j-i), res);
                }        
             
                
                
            }
        }
        
        return res;
     */
    
        int start=0;
        int end = height.length-1;
        
        while(start<end){
             res= Math.max(Math.min(height[start], height[end])*(end-start), res);
            
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
            
        }
        
        return res; 
        
        
    }
}