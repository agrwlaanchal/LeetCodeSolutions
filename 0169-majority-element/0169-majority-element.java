class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(hmap.containsKey(nums[i]))
                hmap.put(nums[i], hmap.get(nums[i])+1);
            else
                hmap.put(nums[i],1);
            
            if(hmap.get(nums[i])>max && hmap.get(nums[i])> nums.length/2){
                max=nums[i];
            }
        }
        return max;
    }
}