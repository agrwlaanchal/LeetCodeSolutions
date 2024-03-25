class Solution {
    public List<Integer> findDuplicates(int[] nums) {
 
        List<Integer> arr = new ArrayList<>();
        
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            
            if(hset.contains(nums[i])){
                arr.add(nums[i]);
            }else{
                hset.add(nums[i]);
            }
            
        }
        
        return arr;
        
        
    }
}