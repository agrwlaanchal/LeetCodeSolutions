class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
     
       Arrays.sort(nums); 
            int[]dp = new int[nums.length];
        Arrays.fill(dp,1);
        dp[0]=1;
        int max=1;
        int maxindex =0; 
        for(int i=1;i<nums.length;i++){
            
            for(int j=0; j<i;j++){
                
                if(nums[j]%nums[i]==0 || nums[i]%nums[j]==0){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                    
                }
                            }
         //  System.out.println(nums[i] + " "+dp[i]+" "+max);
            if(dp[i]>max){
                    max=dp[i];
                    maxindex= i;
                }
                
//               System.out.println(Arrays.toString(dp));

            
        }
        
        
      //  System.out.println(max +" "+maxindex);
        int maxnum = nums[maxindex];
        
        ArrayList<Integer> arr= new ArrayList<>();
        int count=max-1;
        arr.add(maxnum);
        for(int i=maxindex-1; i>=0;i--){
            if(dp[i]==count && (nums[i]%maxnum==0 || maxnum%nums[i]==0 )){
                arr.add(nums[i]);
                count--;
                maxnum = nums[i];
            }
        }
        
        Collections.sort(arr); 
        return arr;
    }
}