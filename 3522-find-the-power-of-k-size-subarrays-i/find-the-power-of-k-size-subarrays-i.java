class Solution {
    public int[] resultsArray(int[] nums, int k) {
        
        ArrayList<Integer>temp = new ArrayList<Integer>();
         ArrayList<Integer> res = new ArrayList<>();
        
        if(nums.length<=k){
            for(int num: nums)
                temp.add(num);
              res.add(ifCons(temp));
            int[]result = new int[1];
           result[0] = res.get(0);
            return result; 
                  
        }
        
        
        
        for(int i=0;i<k;i++){
            temp.add(nums[i]);
        }
        
       
        res.add(ifCons(temp));
        
        for(int i=k;i<nums.length;i++){
            temp.remove(0);
            temp.add(nums[i]);
            res.add(ifCons(temp));
        }
        
         int[]result = new int[res.size()];
        for(int i=0;i<result.length;i++){
            result[i] = res.get(i);
        }
        return result; 
        
        
    }
    
    
    public int ifCons(ArrayList<Integer> temp){
        
        int num = temp.get(0);
        
        
        for(int i=1;i<temp.size();i++){
            if(num>=temp.get(i))
                return -1;
            if(num+1!=temp.get(i))
                return -1;
            num=temp.get(i);
        }
        
        return num; 
    }
    
    
}