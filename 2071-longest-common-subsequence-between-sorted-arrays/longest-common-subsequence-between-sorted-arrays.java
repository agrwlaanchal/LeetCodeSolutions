class Solution {
    public List<Integer> longestCommonSubsequence(int[][] arrays) {
        
      int[]arr1 = new int[101];
      Arrays.fill(arr1,0);

      for(int i=0; i<arrays[0].length;i++){
        arr1[arrays[0][i]]++;
      }
   

       for(int i=1; i<arrays.length;i++){
        int[]arr = arrays[i];

        for(int j=0;j<arr.length;j++){
            arr1[arr[j]]++;
        }

        for(int j=0;j<arr1.length;j++){
            if(arr1[j]!=2){
                arr1[j]=0;
            }else{
                arr1[j]=1;
            }
        }

       }

        List<Integer> res = new ArrayList<>();
       for(int i=0;i<arr1.length;i++){
            if(arr1[i]==1){
                res.add(i);
            }
       }

return res;
        

    }
}