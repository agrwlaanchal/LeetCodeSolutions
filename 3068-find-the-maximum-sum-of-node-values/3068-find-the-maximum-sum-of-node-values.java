class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
     
        int diff [] = new int[nums.length];
        
        long sum =0; 
        int count =0 ;
        for(int i=0; i<nums.length ;i++){
            
            int newnum = nums[i]^k;
            if(newnum>nums[i]){
                sum=sum+newnum; 
                diff[i] = newnum-nums[i];
                count++;
            }else{
                sum=sum+nums[i];
                diff[i] = nums[i]-newnum; 
            }
        }
        
      //  System.out.println(sum);
       // System.out.println(Arrays.toString(diff));
        if(count%2==0){
            return sum;
        }else{
        Arrays.sort(diff);
            return sum-diff[0];
        }
       
        
        
       // return 0; 
        
    }
}