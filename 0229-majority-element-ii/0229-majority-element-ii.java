class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
        int n = nums.length;
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        //boolean visited [] = new boolean[9999999];
        
        for(int i=0;i<nums.length; i++){
            if(hmap.containsKey(nums[i]) && hmap.get(nums[i])==-1){
                //already visited and counted
                continue;
            }else{
                hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
                if(hmap.get(nums[i])>n/3){
                    arr.add(nums[i]);
                    hmap.put(nums[i],-1);
                }
            }
        }
        return arr; 
        
        
    }
}