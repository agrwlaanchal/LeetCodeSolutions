class Solution {
    public boolean judgeSquareSum(int c) {
        
        int num =(int) Math.sqrt(c);
  
        HashSet<Integer> arr = new HashSet<>();
        for(int  i=0;i<=num;i++){
            
            int t= i*i;
            
            arr.add(t);
            if(arr.contains(c-t)){
                return true;
            }
            
            
        }   
        
      
        return false;
        
    }
}