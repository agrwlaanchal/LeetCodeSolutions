class Solution {
    public String removeKdigits(String nums, int k) {
     
        if(k==0){
            return nums;
        }
        
        if(k>=nums.length()){
            return "0";
        }
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<nums.length();i++){
            
            char c =nums.charAt(i);
            
            while(!st.isEmpty() && st.peek() > c && k > 0 )
            {st.pop();
             k--;
            }
             st.push(c);
            
        }
        
        while(k>0){
            st.pop();
            k--;
        }
        
       StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        sb.reverse();
        
        //remove 0 at beiginning, except 0
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();        
    }
}