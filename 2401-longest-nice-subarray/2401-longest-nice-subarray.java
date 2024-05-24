class Solution {
    public int longestNiceSubarray(int[] nums) {
        
    
       // ArrayList<Integer> arr  = new ArrayList<>();
        //arr.add(nums[0]);
        int max = 0;
        int start =0 ;
        int end =0;
     outer:   while(end<nums.length){
           
            for(int i=start;i<end;i++){
                
                if((nums[i]&nums[end])!=0){
                    max = Math.max(end-start, max);
                    start = i+1;
                    continue outer;
                }
            }
         end++;
            
        }
        max = Math.max(end-start, max);
        return max; 
        
        
      /*outer:  for(int i=1; i<nums.length;i++){
            
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
        return max; */
    }
}