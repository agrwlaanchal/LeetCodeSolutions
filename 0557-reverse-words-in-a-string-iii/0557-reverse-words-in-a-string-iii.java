class Solution {
    public String reverseWords(String s) {
        
     
            String res = "";
        String temp = "";
            for(int i=0; i<s.length();i++){
                
                if(s.charAt(i)!=' '){
                    temp=temp+s.charAt(i);
                }else{
                    res = res+rev(temp)+" ";
                    temp ="";
                }
                
                
            }
        res=res+rev(temp);
        return res;
        
        
        
    
    
}
    public String rev(String s){
        
        char[]arr = s.toCharArray();
        String res = "";
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            char t = arr[start];
            arr[start] =arr[end];
            arr[end] =t;
            start++;
            end--;
        }
        
        return String.valueOf(arr);
        
    }
}