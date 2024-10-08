class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
     
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp  = new  ArrayList<>();
        
        traverse(candidates, target,0, temp, res);
        
        
        return res;
        
    }
    
    private void traverse(int[]candidates, int target, int start,  List<Integer> temp , List<List<Integer>> res ){
        
         if(target==0){
               
                res.add(new ArrayList<>(temp));
             return; 
               }
        
        if(target<0){
            return ; 
        }
        
        
        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            temp.add(candidates[i]);
            traverse(candidates, target - candidates[i], i + 1, temp, res);
            temp.remove(temp.size() - 1);
        }
           
        
        
            
        
            
        
        
        
    }
    
}