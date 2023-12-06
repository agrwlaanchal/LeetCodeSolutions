class Solution {
    public int totalMoney(int n) {
        
        int weeks = n/7;
        
        int no_of_days = n%7;
        int prevmonday =0;
        int count = 0;
        int res = 0;
        for(int i=0; i<=weeks;i++){
            
            if(i<weeks){
                
                prevmonday++;
                count = prevmonday;
                for(int j=1;  j<=7;j++){
                    res = res+count;
                    count++;
                }
                
                
            }else{
                prevmonday++;
                    count = prevmonday;
          
                for(int j=1;j<=no_of_days; j++){
                         
                    res = res+count;
                    count++;
                }
                    
                }
            }
        
        return res;
            
        }
    
}