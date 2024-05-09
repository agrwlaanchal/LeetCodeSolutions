import java.util.*;
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
     
      
      long sum =0;
        
        Arrays.sort(happiness);
        int index = happiness.length-1;
        int desc =0 ;
        
        while(k>0 && index>=0){
            
            if(happiness[index]-desc>0){
                sum=sum+happiness[index]-desc;
            }
            index--;
            k--;
            desc++;
            
        }
        
        return sum; 
        
        
        
    }
}