class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
     
        
        if(flowerbed.length==1){
            
            if(flowerbed[0]==0 && n>0){
                flowerbed[0]=1;
                n--;
            }
        }
        
        for(int i=0;i<flowerbed.length;i++){
            
            
            if(flowerbed[i]==0 && n>0){
                
                if(i==0 && i+1<flowerbed.length && flowerbed[i+1]!=1){
                    flowerbed[i]=1;
                    n--;
                } else if(i==flowerbed.length-1 && i-1>=0 && flowerbed[i-1]!=1){
                    flowerbed[i]=1;
                    n--; 
                } else if (i-1>=0 && flowerbed[i-1]!=1 && i+1<flowerbed.length && flowerbed[i+1]!=1 ){
                    flowerbed[i]=1;
                    n--;
                }
                
            }
            
            // System.out.println(Arrays.toString(flowerbed));
        }
        
    //  System.out.println(Arrays.toString(flowerbed));
        
        if(n==0)
            return true;
        
        return false;
        
    }
}