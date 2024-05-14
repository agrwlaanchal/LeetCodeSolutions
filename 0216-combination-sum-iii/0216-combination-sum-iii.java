class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
         List<List<Integer>> res =new ArrayList<>();
         int[] nums = new int[9];
        for(int i=0;i<nums.length;i++){
            nums[i]=i+1;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        check(nums, k, n, temp, res, 0);
        return res;
    }
    
    public void check(int[]nums, int k, int target, ArrayList<Integer> temp, List<List<Integer>> res, int index){
        
        if(k<0){
            return; 
        }
        if(target<0){
            return;
        }else if(target==0 && k==0){
            res.add(new ArrayList<>(temp));
        }else{
            
            for(int i=index;i<nums.length;i++){
                temp.add(nums[i]);
                check(nums, k-1, target-nums[i], temp, res, i+1);
                temp.remove(temp.size()-1);
            }
            
            
        }
        
        
    }
    
    
}