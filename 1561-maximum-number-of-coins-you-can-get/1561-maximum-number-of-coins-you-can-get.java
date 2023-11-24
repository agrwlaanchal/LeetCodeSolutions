class Solution {
    public int maxCoins(int[] piles) {
      
        
        // 1 2 2 4 7 8
        
        
        //278 //124
        
        //1 2 3 4 5 6 7 8 9 
        
        // 389 //267 // 145
        
        // 8 6 4 
        
        Arrays.sort(piles);
        
        int nopiles = piles.length/3;
        
        
        int start = nopiles-1;
        
        int end = piles.length-2;
        
          int count =0; 
        while(start>=0){
            
            count = count+piles[end];
            end=end-2;
            start--;
            
        }
        
        
       return count; 
        
        
    }
}