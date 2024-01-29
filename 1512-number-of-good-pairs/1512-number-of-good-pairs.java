class Solution {
    public int numIdenticalPairs(int[] nums) {
     
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        int res =0 ;
        
        for(int num: nums){
            if(hmap.containsKey(num)){
                res=res+hmap.get(num);
                hmap.put(num, hmap.get(num)+1);
            }else{
                hmap.put(num,1);
            }
        }
        return res;
        
    }
}