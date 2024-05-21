class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        
        List<List<Integer>>  res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int index =0;
         calsub(nums, subset,res, 0);
        return res; 
    }
    
    public void calsub(int[]nums,List<Integer> subset ,  List<List<Integer>>  res, int index){
        
        res.add(new ArrayList<>(subset));
        
        for(int i=index; i<nums.length;i++){
            
            subset.add(nums[i]);
            calsub(nums, subset, res, i+1);
            subset.remove(subset.size()-1);
            
        }
        
        
    }
    
    
    
    
    
    
}