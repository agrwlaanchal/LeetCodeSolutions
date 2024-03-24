class Solution {
    public int findDuplicate(int[] nums) {
     
        HashSet<Integer>hset = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hset.contains(nums[i]))
                return nums[i];
            else
                hset.add(nums[i]);
        }
        return -1;
    }
}