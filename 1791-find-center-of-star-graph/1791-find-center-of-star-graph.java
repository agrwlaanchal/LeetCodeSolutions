class Solution {
    public int findCenter(int[][] edges) {
     
        HashMap<Integer, Integer> hmap =new HashMap<>();
        int resNum =1;
        int resCount =0;
        
        for(int[] arr:edges){
            
            hmap.put(arr[0],hmap.getOrDefault(arr[0],0)+1);
            if(hmap.get(arr[0])>resCount){
                resCount = hmap.get(arr[0]);
                resNum = arr[0];
            }
            
            hmap.put(arr[1],hmap.getOrDefault(arr[1],0)+1);
            if(hmap.get(arr[1])>resCount){
                resCount = hmap.get(arr[1]);
                resNum = arr[1];
            }
            
        }
        return resNum;
    }
}