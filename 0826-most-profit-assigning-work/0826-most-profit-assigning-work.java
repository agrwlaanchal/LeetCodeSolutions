class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
 
       
        
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        for(int i=0; i<profit.length;i++){
            int prof = profit[i];
            int diff = difficulty[i];
            if(tmap.containsKey(diff)){
                continue;
            }
            for(int j=0;j<profit.length;j++){
                if(difficulty[j]<=diff && profit[j]>=prof){
                    prof = profit[j];
                }
            }
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