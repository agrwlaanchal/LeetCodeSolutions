class Solution {
    public int minimumChairs(String s) {
     
        int count=0;
        int max =0; 
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(c=='E'){
                count++;
            }else{
                count--;
            }
            
            max = Math.max(max, count);
            
        }
        return max; 
        
        
    }
}