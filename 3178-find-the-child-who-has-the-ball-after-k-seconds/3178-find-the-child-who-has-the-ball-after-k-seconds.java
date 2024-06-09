class Solution {
    public int numberOfChild(int n, int k) {
       
        
       
            
            
            while(k>2*(n-1)){
                k=k-(2*(n-1));
            }
            
            if(k>=n){
               k=k-(n-1);
            //    System.out.println("k here "+k);
                for(int i=n-2;i>=0;i--){
                    k--;
              //      System.out.println(k+" "+i);
                    if(k==0){
                        return i;
                    }
                }
                return -1;
            }else{
                return k;
            }
            
            
            
        
        
        
    }
}