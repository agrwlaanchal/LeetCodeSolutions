class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        
        int maxlen =0; 
        int startindex =-1 ;
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0 ;i<nums.length;i++){
            
            hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
            
            while(hmap.get(nums[i])>k){
                startindex++;
                
                hmap.put(nums[startindex], hmap.get(nums[startindex])-1);
                
            }
            
            maxlen = Math.max(maxlen, i-startindex);
            
        }
        return maxlen;
        
    }
}