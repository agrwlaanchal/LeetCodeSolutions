class Solution {
    public int longestNiceSubarray(int[] nums) {
        
    
        ArrayList<Integer> arr  = new ArrayList<>();
        arr.add(nums[0]);
        int max = 1;
        
      outer:  for(int i=1; i<nums.length;i++){
            
            for(int j=0;j<arr.size();j++){
                
                if((arr.get(j)&nums[i])!=0){
                    //start a new subarray 
                    max=Math.max(arr.size(), max);
                  // we need to keep elements at and after j 
                   ArrayList<Integer> temp = new ArrayList<>();
                    for(int k=j+1;k<arr.size();k++){
                        temp.add(arr.get(k));
                    }
                    arr.clear();
                    i--;
                //    temp.add(nums[i]);
                    arr = temp; 
                    continue outer;
                }
                
            }
            arr.add(nums[i]);
            
        }
    
     max=Math.max(arr.size(), max);
        return max; 
    }
}