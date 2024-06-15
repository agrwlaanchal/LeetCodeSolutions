 class Pair {
        int capital;
        int profit;

        Pair(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }
    }

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        
     
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (b.profit != a.profit) {
                return Integer.compare(b.profit, a.profit);
            } else {
                return Integer.compare(a.capital, b.capital);
            }
        });
        
        for (int i = 0; i < profits.length; i++) {
            pq.add(new Pair(capital[i], profits[i]));
        }
        
        int res =w; 
        
        int index =0; 
        
        while(k>0){
            
            boolean flag = false;
            int size = pq.size();
            ArrayList<Pair>arr =new ArrayList<>();
            for(int i=0; i<size;i++){
                
                Pair pair = pq.poll();
            int cap = pair.capital;
           int profit = pair.profit;
           // System.out.println("w "+w+" cap "+cap+" profit "+profit);      
                if(cap<=w){
                  w=w+profit;
                    res=res+profit;
                    k--;
                    flag=true;
                    break;   
                }else{
                    arr.add(pair);
                }
                
            }
            
            if(!flag){
                break;
            }
            for(Pair p: arr){
                pq.add(p);
            }
            
            
        }
        
     
        return res; 
        
    }
}