
class Pair implements Comparable<Pair> {
    
    int rowValue;
    int soldiers;
    
    Pair(int r, int s){
        this.rowValue = r;
        this.soldiers = s;
    }
    public int compareTo(Pair p){
       if( this.soldiers - p.soldiers == 0){
           return this.rowValue - p.rowValue;
       }else{
           return this.soldiers - p.soldiers;
       }
    }
    
}

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
    PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
    
        for(int i=0;i<mat.length;i++){
            int count =0 ;
            for(int j=0; j<mat[i].length ;j++){
                if(mat[i][j] == 1)
                    count++;
            }
            
            Pair p = new Pair(i, count);
            pq.add(p);
        }
        
        
    
    
    int []res = new int[k];
    int i=0;
   while(i<k){
       Pair p = pq.poll();
     //  System.out.println(p.rowValue +" "+p.soldiers);
       res[i] = p.rowValue;
       i++;
   }
    return res;
    
}
}