class Solution {
    public double averageWaitingTime(int[][] customers) {
      
        int freeTime =customers[0][0];
        long res =0;
        int n = customers.length;
        for(int cust[]: customers){
            int arrival = cust[0];
            int prep = cust[1];
          //  System.out.println("freeTime "+freeTime+" "+arrival+" "+prep);
            if(arrival>=freeTime){
                res=res+prep;
                freeTime = arrival+prep; 
              //  System.out.println("freeTime "+freeTime+" res "+res);
            }else{
                res = res+ (freeTime+prep-arrival);
                freeTime = freeTime+prep; 
            //   System.out.println("freeTime "+freeTime+" res "+res);
            }
            
        }
        return (double)res/n; 
        
        
    }
}