class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>> res =new ArrayList<>();
        Arrays.sort(candidates);
        ArrayList<Integer> temp = new ArrayList<>();
   
            
        check(candidates, 0, target, temp,res);
            
        return res; 
        
    }
    
    public void check(int[]candidates, int start, int target, ArrayList<Integer> temp,List<List<Integer>> res ){
        
        if(target<0){
            return;
        }
       else if(target==0){
            res.add(new ArrayList<>(temp));
        }else{
           
           for(int i=start;i<candidates.length;i++){
               temp.add(candidates[i]);
               check(candidates, i, target-candidates[i], temp,res);
               temp.remove(temp.size()-1);
           }
       }
      
        
    }
    
}