class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
     
        int start =0;
        int end =0;
        
       /* int[]arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = Math.abs(s.charAt(i)-t.charAt(i));
        }*/
        
        
        int len=0;    
        
        while(end<s.length()){
            
            maxCost = maxCost-(Math.abs(s.charAt(end)-t.charAt(end)));
            if(maxCost>=0){
                len = Math.max(len, end-start+1);
                
            }else{
                maxCost = maxCost+(Math.abs(s.charAt(start)-t.charAt(start)));
                start++;
            }
            
            end++;
            
        }
        return len; 
        
        
    }
}