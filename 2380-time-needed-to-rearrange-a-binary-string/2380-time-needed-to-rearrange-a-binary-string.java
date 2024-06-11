class Solution {
    public int secondsToRemoveOccurrences(String s) {
        
        int count =0; 
        while(s.contains("01")){
          //  System.out.println("s "+s);
            char []arr = s.toCharArray();
                count++;
            for(int i=0;i<arr.length-1;i++){
                
                if(arr[i]=='0'&&arr[i+1]=='1'){
                    arr[i]='1';
                    arr[i+1]='0';
                    i++;
                    
                }
                
            }
            
            s=new String(arr);
         //    System.out.println("s "+s);
        }
        
        return count;
        
        
        
    }
}