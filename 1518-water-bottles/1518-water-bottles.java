class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int res=numBottles;
         int count1 = numBottles/numExchange;
         int count2 = numBottles%numExchange;
            
        while(count1>0){
            
            numBottles = count1+count2;
            res=res+count1;
            count1 = numBottles/numExchange;
            count2 = numBottles%numExchange;
        }
        return res;
        
    }
}