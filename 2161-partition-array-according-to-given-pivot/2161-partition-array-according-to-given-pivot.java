class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
     
        ArrayList<Integer> sm = new ArrayList<>();
        ArrayList<Integer> gm = new ArrayList<>();
        
        int count=0;
        
          int[]res = new int[nums.length];
        int index =0 ;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==pivot)
                count++;
            else if(nums[i]<pivot)
            {
                res[index] = nums[i];
                index++;
            }
            else
                gm.add(nums[i]);
            
        }
        
        
      
        
       
        for(int j=0;j<count;j++){
            res[index] = pivot;
            index++;
        }
        
        for(int nu:gm){
            res[index ] = nu;
            index++;
        }
        
        return res;
        
        
    }
}