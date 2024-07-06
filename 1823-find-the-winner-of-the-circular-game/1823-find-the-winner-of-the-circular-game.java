class Solution {
    public int findTheWinner(int n, int k) {
       
    Queue<Integer> pq = new LinkedList<>();
        
        for(int i=1;i<=n;i++){
            
            pq.add(i);
        }
        
        
        while(pq.size()>1){
            
            int count =0;
            for(int i=1;i<k;i++){
                int t = pq.poll();
                pq.offer(t);
            }
            if(pq.size()>1)
            pq.poll();
            
        }
        
        return pq.poll();
        
    }
}