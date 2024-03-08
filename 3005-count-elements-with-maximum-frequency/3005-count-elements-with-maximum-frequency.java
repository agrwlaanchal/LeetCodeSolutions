class Solution {
    public int maxFrequencyElements(int[] nums) {
     
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count =0 ;
        
        for(int i=0; i<nums.length ; i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i], hmap.get(nums[i])+1);
            }else{
                hmap.put(nums[i],1);
            }
            
            if(hmap.get(nums[i])>count){
                count=hmap.get(nums[i]);
            }
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