class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
     
        
        
        
        //arrivalTimes[i] = (int) Math.ceil((double) dist[i] / speed[i]);
        
        int arrival[] = new int[dist.length];
        
        for(int i=0;i<dist.length;i++){
            arrival[i] =  (int) Math.ceil((double) dist[i] / speed[i]);
          //System.out.print(arrival[i]+" ");
        }
        
        Arrays.sort(arrival);
        
        int time =0; 
        int count=0;
        for(int i=0;i<arrival.length;i++){
            if(time<arrival[i]){
                time = time+1;
                count++;
            }else{
                return count;
            }
        }
        
        
        return count ;
        
    }
}