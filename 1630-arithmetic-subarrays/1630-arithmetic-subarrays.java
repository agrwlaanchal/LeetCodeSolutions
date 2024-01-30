class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
     
        List<Boolean> res = new ArrayList<>();
        int m = l.length;
        
        for(int i=0;i<m; i++){
            
           ArrayList<Integer> arr = new ArrayList<>();
            
           
                
                int start = l[i];
                int end = r[i];
           
          /*  if(end-start<2)
            {
                res.add(false);
            //    System.out.println("adding here first");
                continue;
            }*/
            
             for(int j=start; j<=end; j++){
                 arr.add(nums[j]);
             }
            
            Collections.sort(arr);
            
            if(arr.size()<2)
                res.add(false);
            
           int diff = arr.get(1)-arr.get(0);
            int flag=0;
            for(int j=2;j<arr.size();j++){
                if(arr.get(j)-arr.get(j-1)!=diff){
                    res.add(false);
                    flag=1;
                //    System.out.println("adding here second");
                    break;
                }
            }
            if(flag==0)
            res.add(true);
            //    System.out.println("adding here third");
            
            
        }
        
        return res;
        
    }
}