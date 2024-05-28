class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
     
        int start =0;
        int end =0;
        
        int[]arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = Math.abs(s.charAt(i)-t.charAt(i));
        }
        
        //System.out.println(Arrays.toString(arr));
        //return -1; 

        
        int len=0;
    //    int currsum = arr[0];
    
        
        
        while(end<arr.length){
            
            maxCost = maxCost-arr[end];
            if(maxCost>=0){
                len = Math.max(len, end-start+1);
                
            }else{
                maxCost = maxCost+arr[start];
                start++;
            }
            
            end++;
            
        }
        return len; 
        
        
    }
}