class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)
        return 0; 

       int result = 1; //starting element 
       
       
       HashSet<Integer> hset = new HashSet<>();
        for(int num: nums)
        {
            hset.add(num);
        }
        
            for(int i=0;i<nums.length;i++){
                int num = nums[i];
                if(!hset.contains(num-1)){
                    int len =1;
                    while(hset.contains(num+len)){
                        len++;
                    }
                    result = Math.max(result, len);
                }
            }

           

        return result; 


    }
}
