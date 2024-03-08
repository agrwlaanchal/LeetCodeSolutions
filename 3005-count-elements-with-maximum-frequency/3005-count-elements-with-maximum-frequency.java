class Solution {
    public int maxFrequencyElements(int[] nums) {
     
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count =0 ;
        
        for(int i=0; i<nums.length ; i++){
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
            count = Math.max(count, hmap.get(nums[i]));
        }
        
        int rescount  =0;
        
        
        
        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
            if(entry.getValue()==count){
                rescount ++;;
            }
        }
        
        return rescount*count; 
    }
}