class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int []freq = new int[A.length+1];
        Arrays.fill(freq, 0);
        int res[] = new int[A.length];
        for(int i=0;i<A.length;i++){

            freq[A[i]]++;
            freq[B[i]]++;
            int count =0 ;
            for(int j=0;j<freq.length;j++){
                if(freq[j]==2){
                    count++;
                }
            }
            res[i] = count;

        }
        return res;




    }
}