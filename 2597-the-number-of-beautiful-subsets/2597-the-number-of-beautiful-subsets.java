class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        
        int count =0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        Arrays.sort(nums);
        int index =0; 
       return  calsub(nums, k, hmap,index )-1;
        
    }
    
    
    
    public int calsub(int[]nums, int diff, HashMap<Integer,Integer> hmap, int index){
        
        if(index==nums.length){
            return 1; 
        }
        
         int totalCount = calsub(nums, diff, hmap, index + 1);
        
        if(!hmap.containsKey(nums[index]-diff)){
            //add it to hmap 
             hmap.put(nums[index], hmap.getOrDefault(nums[index],0)+1);
             
            totalCount += calsub(nums, diff, hmap, index+1);
            
            //remove element 
            hmap.put(nums[index], hmap.get(nums[index])-1);
            
            if(hmap.get(nums[index])==0){
                hmap.remove(nums[index]);
            }
        }
        return totalCount ; 
        
        
    }
    
    
}


