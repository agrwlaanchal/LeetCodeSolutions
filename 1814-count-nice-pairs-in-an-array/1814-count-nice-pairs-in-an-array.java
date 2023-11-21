class Solution {
    public int countNicePairs(int[] nums) {
        
        
        int count=0;
        final int mod = 1000000007;
        
      //  int diff [] = new int[nums.length];
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<nums.length;i++){
            int diff = nums[i] - rev(nums[i]);
            if(hmap.containsKey(diff)){
               count = (int)(count+ hmap.get(diff))%(mod);
                hmap.put(diff, hmap.get(diff)+1);
            }else{
                hmap.put(diff, 1);
            }
        }
        
       /* for(Map.Entry<Integer , Integer> entry: hmap.entrySet())
            
        {
            if(entry.getValue()>=2){
             int val = entry.getValue();
                count = (count+(int) (val*(val-1))/2 )%mod;
            }
        }*/
        
        return count; 
        
    }



public int rev(int num){
    int res =0 ;
    
    while(num>0){
        res=res*10+num%10;
        num=num/10;
        
    }
    return res;
}
}