class Solution {
    public int[] countBits(int n) {

     int[]res = new int[n+1];

     for(int i=0; i<res.length;i++){

         String temp = Integer.toBinaryString(i);
         int count=0;
         for(int j=0;j<temp.length();j++){
             if(temp.charAt(j)=='1'){
                 count=count+1;
             }
         }
         res[i]=count;

     }
     return res; 

    }
}