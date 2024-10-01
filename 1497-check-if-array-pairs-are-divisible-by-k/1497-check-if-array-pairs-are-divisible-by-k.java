class Solution {
    
     private class Comparator implements java.util.Comparator<Integer> {

        private int k;

        public Comparator(int k) {
            this.k = k;
        }

        public int compare(Integer i, Integer j) {
            return ((k + (i % k)) % k) - ((k + (j % k)) % k);
        }
    }
    
    public boolean canArrange(int[] arr, int k) {
     
        Map<Integer, Integer> remainderCount = new HashMap<>();

        // Store the count of remainders in a map.
        for (int i : arr) {
            int rem = ((i % k) + k) % k;
            remainderCount.put(rem, remainderCount.getOrDefault(rem, 0) + 1);
        }
        
        for(int i:arr){
            
            int rem = ((i%k)+k)%k;
            
            if(rem==0){
                if(remainderCount.get(rem)%2==1){
                    return false;
                }
            }else if (
                !Objects.equals(
                    remainderCount.get(rem),
                    remainderCount.get(k - rem)
                )
            ) return false;
            
            
        }
        
        return true;
        
    }
}