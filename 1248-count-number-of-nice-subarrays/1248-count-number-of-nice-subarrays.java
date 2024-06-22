class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
     
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }
        
        
        int curr = 0;
        int res =0;
        
         HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0, 1);
        
        for(int i=0;i<nums.length ;i++){
            
            curr = curr+nums[i];
            if(hmap.containsKey(curr-k)){
                res=res+hmap.get(curr-k);
            }
            
            hmap.put(curr, hmap.getOrDefault(curr, 0)+1);
        }
        
         return res;
        
    }
}



/*
 HashMap<Integer, Integer> hmap = new HashMap<>();
        //we have 1 count of presum 0 
        hmap.put(0, 1);
        int presum =0;
        int sum = k;
        int count =0; 
       
        for(int i=0;i<nums.length;i++){
            
            
           
            presum=presum+nums[i];
            int req = presum-k;
            
            if(hmap.containsKey(req)){
                count = count+hmap.get(req);
            }
            
            hmap.put(presum, hmap.getOrDefault(presum,0)+1);

           
        }
        return count;
        
*/