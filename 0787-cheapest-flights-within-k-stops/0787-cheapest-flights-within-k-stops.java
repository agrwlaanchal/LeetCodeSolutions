class Pair{
    
    int node;
    int price;
    
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
     
        
        HashMap<Integer, ArrayList<Pair> > hmap =new HashMap<>();
        
        for(int i=0; i<flights.length;i++){
            
            if(hmap.containsKey(flights[i][0])){
                ArrayList<Pair> temp = hmap.get(flights[i][0]);
                Pair p = new Pair();
                p.node = flights[i][1];
                p.price = flights[i][2];
                temp.add(p);
                hmap.put(flights[i][0],temp);
            }else{
                ArrayList<Pair> temp = new ArrayList<>();
                Pair p = new Pair();
                p.node = flights[i][1];
                p.price = flights[i][2];
                temp.add(p);
                hmap.put(flights[i][0], temp);
            }
        }
        
        boolean[]visited = new boolean[n];
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
       Queue<Pair> q = new LinkedList<>();
        Pair srcpair = new Pair();
        srcpair.node = src;
        srcpair.price =0; 
        q.offer(srcpair);
        int stops =0;
        dist[src] =0; 
        
        while(!q.isEmpty() && stops <=k){
            
            System.out.println(stops+" "+k);
            int size = q.size();





            while (size-- > 0) {
                Pair curr = q.poll();
                int node = curr.node;
                int distance = curr.price;

                if (!hmap.containsKey(node)) continue;

                for (Pair next: hmap.get(node)) {
                    int neighbour = next.node;
                    int price = next.price;
                    if (price + distance >= dist[neighbour]) continue;
                    dist[neighbour] = price + distance;
                    Pair p = new Pair();
                    p.node = neighbour;
                    p.price = dist[neighbour];
                    q.offer(p);
                }
            }
             stops++;
            
        }
        
        if(dist[dst]==Integer.MAX_VALUE){
            return -1;
        }
        
        return dist[dst];
 
        
        
    }
}