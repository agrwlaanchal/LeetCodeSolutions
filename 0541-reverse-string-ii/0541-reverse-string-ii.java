class Solution {
    public String reverseStr(String s, int k) {
        
         char[] ch = s.toCharArray();
        int index =0;
        
        while(index <s.length()){
            
            int start = index;
            int end = index+k-1;
            if(end>=s.length()){
                end = s.length()-1;
            }
            
            while(start<=end){
               char temp = s.charAt(start);
                ch[start] = ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
            
            index = index+(2*k);
            
            
        }
        return new String(ch);        
        
    }
}