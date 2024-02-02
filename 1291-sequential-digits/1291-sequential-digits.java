class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
     
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        
        List<Integer> result= new ArrayList<>();
        
        int totalinit = Integer.valueOf(String.valueOf(low).length());
        //System.out.println("totalinit is "+totalinit);
        
        String lo = String.valueOf(low);
        String t = ""+lo.charAt(0);
        
     //   System.out.println("t is "+t);
        int startdigit = Integer.valueOf(t);
        
       // System.out.println("startdigit is "+startdigit);
        
        for(int i=startdigit; i<=9;i++)
            pq.add(i);
        
        int enddig = Integer.valueOf(String.valueOf(high).length());
        
        
        
        while(!pq.isEmpty()){
            
            
            int temp = pq.poll();
        //    System.out.println("temp is "+temp);
            if(temp==9){
                for(int i=1; i<=9;i++)
                pq.add(i);
                totalinit++;
                if(totalinit>enddig)
                    break;
            }else{
                String res=""+temp;
                int u=temp+1;
                for(int i=1;i<totalinit; i++){
                    if(u<=9){
                    res=res+u;
                    u++;
                    }else{
                        break;
                    }
                }
               // System.out.println("res is "+res);
               
                if(res.length()==totalinit){
                    int tobeadded = Integer.valueOf(res);
                if(tobeadded <low || tobeadded>high){
                    continue;
                }
                if(tobeadded >=low && tobeadded<=high){
                    result.add(tobeadded);
                } 
                }
               
                
            }
            
            
            
            
            
        }
        
        return result; 
        
        
    }
}