class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
     
    //find max freq first
        // this will define no of rows
        //based on freq, put the element in rows 
        int max_freq = 1; 
        HashMap <Integer, Integer> hmap = new HashMap<>(); 
        
        for(int i=0; i<nums.length;i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i], hmap.get(nums[i])+1);
            }else{
                hmap.put(nums[i],1);
            }
            
            if(hmap.get(nums[i])>max_freq){
                max_freq=hmap.get(nums[i]);
            }
        }
        
        
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<max_freq; i++){
            List<Integer> temp = new ArrayList<>();
            res.add(temp);
        }
        
        
        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
            
            for(int i=0; i<entry.getValue(); i++){
                res.get(i).add(entry.getKey());
            }
        }
        
        return res; 
        
        
    }
}