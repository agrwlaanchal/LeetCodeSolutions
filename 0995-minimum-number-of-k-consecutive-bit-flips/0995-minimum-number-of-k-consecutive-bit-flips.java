class Solution {
    public int minKBitFlips(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int n = nums.length;
        int ans = 0;
        for(int i = 0;i < n;i++){
            if(queue.size() > 0 && queue.peek() < i) queue.poll();
            if(queue.size() % 2 == nums[i]){
                if(i + k - 1 >= n) return -1;
                ans++;
                queue.add(i + k - 1);
            }
        }
        return ans;
    }
}