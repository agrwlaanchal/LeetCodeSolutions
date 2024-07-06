class Solution {
    public int passThePillow(int n, int time) {
        
        int count = (n-1)*2;
         time = time%count;
       System.out.println(time);
        while(time>0){
            
            for(int i=1;i<n;i++){
                time--;
                
                if(time==0){
                    return i+1;
                }
            }
            
            for(int i=n;i>1;i--){
                time--;
               
                if(time==0){
                    return i-1;
                }
            }
            
        }
        
        return 1;
    }
}