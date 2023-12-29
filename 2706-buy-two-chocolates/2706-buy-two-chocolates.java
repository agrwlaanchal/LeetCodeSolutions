class Solution {
    public int buyChoco(int[] prices, int money) {
     
        Arrays.sort(prices);
        int temp=money;
        temp=temp-prices[0];
        if(temp<0){
            return money;
        }
        
        temp=temp-prices[1];
        if(temp<0){
            return money;
        }
        
        return temp; 
        
    }
}