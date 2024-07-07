class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
     
        
        
        int res = numBottles;
        
        int empty = numBottles;
        numBottles = 0;
        while(empty-numExchange >=0 ){
            
            empty = empty-numExchange;
            numBottles++;
          //  res=res++;
            numExchange++;
       //     System.out.println(" res "+res+" "+numBottles+" "+empty);
            if(empty<numExchange){
                res=res+numBottles;
                empty = empty+numBottles;
                numBottles =0; 
          //      System.out.println(" res "+res+" "+numBottles+" "+empty);
            }
            
        }
        return res;
        
    }
}