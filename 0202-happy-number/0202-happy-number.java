class Solution {
    public boolean isHappy(int n) {
    
        HashSet<Integer> hset = new HashSet<>();
        
        
        while(n>=1){
            
             if(n==1){
                return true;
            }
            int temp = n;
            
            
            int num =0;
            while(temp>0){
                int digit = temp%10;
                num=num+(digit*digit);
                temp=temp/10;
            }
            //System.out.println(num);
           
            
            
            if(hset.contains(num)){
                return false;
            }else{
                hset.add(num);
            }
            
            
            n=num;
            
            
        }
        
        return false;
    }
    
}