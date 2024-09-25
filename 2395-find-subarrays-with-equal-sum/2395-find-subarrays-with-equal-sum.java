class Solution {
    public boolean findSubarrays(int[] nums) {
        
        HashSet<Integer> hset = new HashSet<>();
        //sum
        
        for(int i=1;i<nums.length;i++){
                int sum = nums[i-1]+nums[i];
            if(hset.contains(sum)){
                return true;
            }
            hset.add(sum);
        }
        return false;
        
        
    }
}