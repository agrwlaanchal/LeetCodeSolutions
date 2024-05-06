class Solution {
    public int thirdMax(int[] nums) {
     
       PriorityQueue<Integer> pq = new PriorityQueue<>(3, Comparator.reverseOrder());

        for(int i=0;i<nums.length;i++){
            if (!pq.contains(nums[i])) 
            pq.add(nums[i]);
        }
        
        
        /*int size = pq.size();
        for(int i=0;i<size; i++){
            System.out.print(pq.poll()+" ");
        }
        System.out.println();*/
        
       if(pq.size()<3 && pq.size()>=1){
           return pq.poll();
       }else{
           pq.poll();
           pq.poll();
           return pq.poll();
       }
        
    }
}