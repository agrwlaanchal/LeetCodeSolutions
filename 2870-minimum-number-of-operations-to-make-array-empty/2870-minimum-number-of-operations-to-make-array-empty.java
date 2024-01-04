class Solution {
    public int minOperations(int[] nums) {
     
        HashMap<Integer, Integer> hmap =new HashMap<>();
        
        for(int i=0; i<nums.length;i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i], hmap.get(nums[i])+1);
            }else{
                hmap.put(nums[i],1);
            }
        }
        
        int res=0;
        for(Map.Entry<Integer, Integer> entry :  hmap.entrySet()){
            
            
           if(entry.getValue()==1)
               return -1;
            
            res=res+entry.getValue()/3;
            
            
           
            if(entry.getValue()%3!=0)
                res++;
            
            
        }
        return res; 
        
        
    }
}


