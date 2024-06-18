class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
 
       
        
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        int prev = -1;
        for(int i=0; i<profit.length;i++){
            
            if(tmap.containsKey(difficulty[i]) && tmap.get(difficulty[i])>profit[i])
                continue;
            tmap.put(difficulty[i], profit[i]);
        }
        
        TreeMap<Integer,Integer> rmap = new TreeMap<>();
        Set<Integer> set = tmap.keySet();
        
        for(int num: set){
            int max = tmap.get(num);
            if(prev!=-1){
                max = Math.max(prev, tmap.get(num));
            }
            rmap.put(num, max);
            
            prev = max;
            
        }
    
        
        int res =0; 
        
        
        for(int num: worker){
            if(rmap.floorKey(num)!=null){
                res=res+rmap.get(rmap.floorKey(num));
            }
        }
        
        return res;
        
    }
}