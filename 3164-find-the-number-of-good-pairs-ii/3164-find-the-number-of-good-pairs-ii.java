class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
          
       // Arrays.sort(nums2);
        int n1 = nums1.length;
        long count = 0;
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int n: nums2){
            hmap.put(n, hmap.getOrDefault(n,0)+1);
        }

        long res =0; 
        for(int i=0; i<n1; i++){
            if(nums1[i]%k==0){
                // find all factors of nums1[i]/k 
                int num = nums1[i]/k; 
                
                
                Set<Integer> factors = getAllFactorsVer3(num);
                
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
    
    
    private long getCount(int num, int[]nums2){
        
        int res =0;
        HashSet<Integer> hmap = new HashSet<>();
        
        for(int i=0;i<nums2.length;i++){
        
            if(hmap.contains(nums2[i])){
                res++;
                continue;
            }
            if(num%nums2[i]==0){
                res++;
                hmap.add(nums2[i]);
            }
            
            
        }
        return res;
        
    }
    
    
}