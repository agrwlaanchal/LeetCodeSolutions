class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
     
        
       Arrays.sort(arr);
        int numSat = 1;
        int max = 0;
        if(arr[0] !=1){
           
            arr[0] = 1;
            max=1;
        }
        for(int i=1;i<arr.length;i++){
           
            
            if(arr[i]>=numSat+1){
                numSat++;
            }
        }
        
       
        return numSat; 
        
    }
}