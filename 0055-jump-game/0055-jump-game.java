class Solution {
    public boolean canJump(int[] nums) {
        
        
        boolean []res = new boolean[nums.length];
       res[0]=true; 
        
        for(int i=1; i<nums.length;i++){
            
            //to reach at nums[i];
            
            for(int j=0; j<i;j++){
                if((nums[j]+j)>=i){
                    res[i]= true; 
                    break; 
                }
            }
            if(res[i]==false){
                return false;
            }
        }
       // System.out.println(Arrays.toString(res));
        return res[res.length-1];
        
        
    }
}