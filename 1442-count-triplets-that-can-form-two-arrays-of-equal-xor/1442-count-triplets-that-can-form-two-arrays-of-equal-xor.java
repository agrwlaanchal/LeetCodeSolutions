class Solution {
    public int countTriplets(int[] arr) {
        
        int count =0; 
        for(int start=0; start<arr.length-1;start++){
            int xorA=0;
            for(int mid = start+1; mid<arr.length;mid++){
                xorA=xorA^arr[mid-1];
                
                int xorB = 0;
                
                for (int end = mid; end < arr.length; ++end) {
                    // Update xorB to include arr[end]
                    xorB ^= arr[end];

                    // found a valid triplet (start, mid, end)
                    if (xorA == xorB) {
                        ++count;
                    }
                }
            }
            
            
        }
        return count;
    }
}