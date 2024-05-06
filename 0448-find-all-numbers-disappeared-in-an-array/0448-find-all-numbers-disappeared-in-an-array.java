class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     
        boolean[]visited = new boolean[nums.length];
        
        for(int i=0;i<nums.length;i++){
            
            visited[nums[i]-1]=true;
            
        }
        
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<visited.length;i++){
            
            if(!visited[i]){
                res.add(i+1);
            }
        }
        return res; 
        
        
    }
}