class KthLargest {

    PriorityQueue<Integer> pq ;
    int size;
    public KthLargest(int k, int[] nums) {
     
        pq = new PriorityQueue<>(3);
        size=k;
        for(int i=0;i<nums.length;i++){
            
            if(pq.size()<k){
                pq.offer(nums[i]);
            }else{
               if (nums[i] > pq.peek()) {
                pq.poll();
                pq.offer(nums[i]);
            }
            }
            
        }
    }
    
    public int add(int val) {
         if(pq.size()<size){
                pq.offer(val);
            }else{
             
             if (val > pq.peek()) {
                pq.poll();
                pq.offer(val);
            }
               
            }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */