class Solution {
    public int findMaxLength(int[] nums) {
        
        if(nums.length==0)
            return 0;
        for(int i=0;i<nums.length ;i++){
            if(nums[i]==0)
                nums[i]=-1;
        }
        
        //find largest contiguous array of sum 0
      //  System.out.println(Arrays.toString(nums));
        //use prefix sum 
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> hmap = new HashMap<>();
          int presum=0;
        int sum=0;
         for(int i=0;i<nums.length;i++){
             presum=presum+nums[i];
              if(presum==sum)
                  max = i+1;
             if(!hmap.containsKey(presum))
                 hmap.put(presum, i);
             if(hmap.containsKey(presum-sum))
                 max=Math.max(max, i-hmap.get(presum-sum));
         }
        
        return max;
    }
}