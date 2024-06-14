class Solution {
    public int minIncrementForUnique(int[] nums) {
     
        int[] arr = new int[1000000];
        Arrays.fill(arr,-1);
        
        Arrays.sort(nums);
        int res =0;
       
        for(int i=0;i<nums.length;i++){
            
            int num = nums[i];
            for(int j=num;j<arr.length;j++){
                
                if(arr[j]==-1){
                    arr[j]=num;
                    res=res+j-num;
                    break;
                }
            }
            
        }
        return res;
       
    }
}