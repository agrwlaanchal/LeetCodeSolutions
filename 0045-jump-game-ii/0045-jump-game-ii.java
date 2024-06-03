class Solution {
    public int jump(int[] nums) {
        
        
          int []res = new int[nums.length];
        Arrays.fill(res, Integer.MAX_VALUE);
     
       res[0]=0;  
        
      outer:  for(int i=1; i<nums.length;i++){
            
            //to reach at nums[i];
            
            for(int j=i-1; j>=0;j--){
                
                if(nums[j]+j>=i){
                    //can reach at i 
                    res[i] = Math.min(res[i], res[j]+1);
                }
                
            }
            
        }
        //System.out.println(Arrays.toString(res));
        return res[res.length-1];
        
    }
}