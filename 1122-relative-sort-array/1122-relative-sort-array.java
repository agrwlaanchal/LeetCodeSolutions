class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
     
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        for(int num:arr1){
            tmap.put(num ,tmap.getOrDefault(num , 0)+1);
        }
        int[]res = new int[arr1.length];
        int index =0; 
        for(int i=0;i<arr2.length;i++){
            
            int num = arr2[i];
            int count = tmap.get(num);
            for(int j=0;j<count;j++){
                res[index++]=num;
            }
           tmap.remove(num); 
        }
        
        for(Map.Entry<Integer,Integer>entry: tmap.entrySet()){
            
            int count = entry.getValue();
            int num = entry.getKey();
             for(int j=0;j<count;j++){
                res[index++]=num;
            }
            
        }
        
        return res;
        
        
        
        
    }
}