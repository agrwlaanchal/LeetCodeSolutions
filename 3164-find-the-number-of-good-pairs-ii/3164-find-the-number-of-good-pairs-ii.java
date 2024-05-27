class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
          
        int n1 = nums1.length;
        
         // count freq of each number in nums2
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int n: nums2){
            hmap.put(n, hmap.getOrDefault(n,0)+1);
        }

        long res =0; 
        //if nums1[i]%k , check for divisibility by nums2 
        for(int i=0; i<n1; i++){
            if(nums1[i]%k==0){
                // find all factors of nums1[i]/k 
                int num = nums1[i]/k; 
                Set<Integer> factors = getAllFactorsVer3(num);
                
                // for each factor, check if it is present in nums2 and update count 
                for(int n: factors){
                    if(hmap.containsKey(n)){
                        res=res+hmap.get(n);
                    }
                }
                
            }
        }
        return res;
        
    }
    
    
    public Set<Integer> getAllFactorsVer3(int n) {
    Set<Integer> factors = new HashSet<>();
    int step = n % 2 == 0 ? 1 : 2;
    for (int i = 1; i <= Math.sqrt(n); i += step) {
        if (n % i == 0) {
            factors.add(i);
            factors.add(n / i);
        }
    }
    return factors;
}
    
    
}