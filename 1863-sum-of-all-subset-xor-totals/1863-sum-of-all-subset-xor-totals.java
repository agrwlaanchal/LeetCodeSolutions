class Solution {
    public int subsetXORSum(int[] nums) {
        
        
      int n = nums.length;
int sum =0; 
         for (int i = 0; i < (1 << n); i++) {
          ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                  
                if ((i & (1 << j)) != 0) {

                    
                    arr.add(nums[j]);
                }
            }
             sum=sum+findxor(arr);
            
             
         }
        return sum;
         
        
    }
    
    public int findxor( ArrayList<Integer> arr){
        
        if(arr.size()<=0){
            return 0; 
        }
        int res = arr.get(0);
        for(int i=1;i<arr.size();i++){
            res=res^arr.get(i);
        }
        return res; 
        
    }
    
    
}