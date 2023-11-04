class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
     
        int time=0;
        
        for(int i=0 ; i<left.length;i++){
            time = Math.max(time, left[i]);
        }
        
        for(int i=0 ; i<right.length;i++){
            time = Math.max(time, n - right[i]);
        }
        
        
        return time;
        
        
    }
}