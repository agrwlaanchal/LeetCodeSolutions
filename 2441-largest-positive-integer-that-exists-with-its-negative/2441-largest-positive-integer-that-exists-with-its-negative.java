class Solution {
    public int findMaxK(int[] nums) {
        
        Arrays.sort(nums);
        HashSet<Integer> hset = new HashSet<>();
        
        int res =0; 
        
        
        for(int i=0; i<nums.length;i++){
            
            if(nums[i]>0){
            //    System.out.println("checking for "+-1*nums[i]);
                if(hset.contains(-1*nums[i])){
                    if(res<nums[i]){
                        res=nums[i];
                    }
                }
                
            }else{
          //      System.out.println("adding "+nums[i]);
                hset.add(nums[i]);
            }
            
        }
        
        if(res==0){
            return -1;
        }
        return res;
    
    }
}