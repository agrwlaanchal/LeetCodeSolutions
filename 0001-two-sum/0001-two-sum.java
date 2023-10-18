class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int[]res= new int[2];
        for(int i=0; i< nums.length ; i++){
            if(hmap.containsKey(target-nums[i])){
                res[0] = hmap.get(target-nums[i]);
                res[1] = i;
                break;
            }else{
                hmap.put(nums[i], i);
            }
        }
        return res;
            
    }
}