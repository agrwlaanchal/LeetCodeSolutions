class Solution {
    public int[][] divideArray(int[] nums, int k) {
     
        Arrays.sort(nums);
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        for(int i=0; i<nums.length;i=i+3){
            
            
            if(i+2<nums.length && nums[i+2]-nums[i]<=k){
                //we got one array 
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(nums[i]);
                arr.add(nums[i+1]);
                arr.add(nums[i+2]);
                res.add(arr);
            }else{
                return new int[0][0];
            }
            
            
        }
        
        
        int[][] result = new int[res.size()][3];
        
        for(int i=0; i<res.size();i++){
            result[i][0] = res.get(i).get(0);
            result[i][1]=res.get(i).get(1);
            result[i][2]=res.get(i).get(2);
        }
        
        return result; 
        
        
    }
}