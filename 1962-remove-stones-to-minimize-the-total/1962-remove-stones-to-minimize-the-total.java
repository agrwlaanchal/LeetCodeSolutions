class Solution {
    public int minStoneSum(int[] piles, int k) {
     
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
                Collections.reverseOrder());
        
        for(int num: piles){
            pq.add(num);
        }
        
        while(k>0){
           int num = pq.poll();
           num = num - (int)Math.floor(num/2);
            pq.add(num);
               k--;
           
        }
        int res=0;
        while(!pq.isEmpty()){
            res=res+pq.poll();
        }
        return res; 
        
        
    }
}