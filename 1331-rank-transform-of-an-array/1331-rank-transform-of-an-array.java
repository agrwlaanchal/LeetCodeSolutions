class Solution {
    public int[] arrayRankTransform(int[] arr) {
     
        int temp[] = arr.clone();
        Arrays.sort(temp);
    //    System.out.println(Arrays.toString(temp));
     //   System.out.println(Arrays.toString(arr));
        
        TreeMap<Integer,Integer> tmap =new TreeMap<>();
        int rank =1;
        for(int i=0;i<arr.length;i++){
            if(!tmap.containsKey(temp[i])){
            tmap.put(temp[i], rank);
            rank++;
            }
        }
        
        int[]res = new int[arr.length];
        for(int i=0;i<res.length;i++){
            res[i] = tmap.get(arr[i]);
        }
        return res;
        
    }
}