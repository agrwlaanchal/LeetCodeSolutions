class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
      
        return slidingwindow(nums, k) - slidingwindow(nums, k-1);
        
    }
    
    public int slidingwindow(int[]nums, int k){
        
        int startindex =0; 
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int ans = 0;
        for(int i=0; i<nums.length;i++){
            
            int num = nums[i];
            
            hmap.put(num, hmap.getOrDefault(num,0)+1);
          
            while(hmap.size()>k){
            
                hmap.put(nums[startindex], hmap.get(nums[startindex])-1);
                if(hmap.get(nums[startindex]) == 0){
                    hmap.remove(nums[startindex]);
                }
                startindex++;
            }
            
            ans=ans+i-startindex+1;
           // System.out.println(startindex+ " "+ans);
        }
        return ans; 
    }
}