class Solution {
    public int maxChunksToSorted(int[] arr) {
      
        int chunks =0 ;
        //evrry time we see increment, chunk, go till increment is going. 
        int maxval =0;
        for(int i=0;i<arr.length;i++){
            
            
                // increasing 
                 maxval = Math.max(maxval, arr[i]);
                if(maxval==i)
                chunks++;
            
            
        }
        return chunks;
        
    }
}