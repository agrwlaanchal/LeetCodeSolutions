class Solution {
    public boolean judgeSquareSum(int c) {
        
        int num =(int) Math.sqrt(c);
  
        int start =0;
        int end = num;
        
        while(start<=end){
           long sum = (long) start * start + (long) end * end; 
            if(sum==c){
                return true;
            }else if(sum<c){
                start++;
            }else{
                end--;
            }
            
        }
      
        return false;
        
    }
}