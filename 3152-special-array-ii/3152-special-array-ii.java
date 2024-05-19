class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        boolean[] sameParity = new boolean[n - 1];
        int[] prefixSum = new int[n];

        // Precompute the parity differences
        for (int i = 0; i < n - 1; i++) {
            sameParity[i] = (nums[i] % 2 == nums[i + 1] % 2);
        }

        // Precompute the prefix sum of sameParity array
        prefixSum[0] = 0;
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + (sameParity[i - 1] ? 1 : 0);
        }

        boolean[] ans = new boolean[queries.length];
        
        // Answer each query using the precomputed prefix sum
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            
            if (start == end) {
                ans[i] = true;  // Single element subarray is trivially special
            } else {
                ans[i] = (prefixSum[end] == prefixSum[start]);
            }
        }
        
        return ans;
    }
}
