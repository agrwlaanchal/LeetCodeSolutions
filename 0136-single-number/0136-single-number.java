class Solution {
    public int singleNumber(int[] nums) {
     
        int len = nums.length/2 +1;
        HashMap<Integer, Integer> hmap= new HashMap<>(len);
        
        for(int num : nums){
            if(hmap.containsKey(num)){
                hmap.put(num,2);
            }else{
                hmap.put(num,1);
            }
        }
        
        
        
        for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
            
            if(entry.getValue()==1)
                return entry.getKey();
        }
        
        return -1;
        
    }
}