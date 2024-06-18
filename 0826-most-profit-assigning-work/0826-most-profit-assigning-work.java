class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
 
       
      //  int[]pro  = new int[profit.length];
        
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        for(int i=0; i<profit.length;i++){
            int prof = profit[i];
            int diff = difficulty[i];
            //for this diff, what's the max profit  
            for(int j=0;j<profit.length;j++){
                if(difficulty[j]<=diff && profit[j]>=prof){
                    prof = profit[j];
                }
            }
        //    pro[i]=prof;
            
            tmap.put(diff, prof);
            
        }
        
        
        
        
        int res =0; 
        Set<Integer> set = tmap.keySet();
        
        for(int num: worker){
            if(tmap.floorKey(num)!=null){
                res=res+tmap.get(tmap.floorKey(num));
            }
        }
        
        return res;
        
    }
}