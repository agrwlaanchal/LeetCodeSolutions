class Solution {
    public int trap(int[] height) {
          if(height.length<=0)
            return 0;
        
        int[]lmax= new int[height.length];
        int []rmax= new int[height.length];
        
        
        lmax[0]=height[0];
        rmax[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++)
            lmax[i]=Math.max(lmax[i-1], height[i]);
        for(int i=height.length-2;i>=0;i--){
            rmax[i]= Math.max(rmax[i+1], height[i]);
        }
        int result=0;
         for(int i=0;i<height.length;i++){
           //  if(Math.min(lmax[i],rmax[i])-height[i]>=0)
             result=result+Math.min(lmax[i], rmax[i]) - height[i]; 
         }
        return result;

    }
}