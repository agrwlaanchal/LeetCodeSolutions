class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length ;i++){
          
            hmap.put(nums[i],hmap.getOrDefault(nums[i], 0)+1);
            
        }
        
        
        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
            
            int n = entry.getValue();
            count = count + (n*(n-1)/2);
            
        }
        return count;
        
    }
}