class Solution {
    public String clearDigits(String s) {
        
        Stack<Character> st = new Stack<>();
        
        char[]arr = s.toCharArray();
        for(char c:arr){
            
            if(Character.isDigit(c)){
            
                if(!st.isEmpty()){
                    st.pop();
                }
                
            }else{
                st.push(c);
            }
            
        }
        
        StringBuilder rs =new StringBuilder();
        while(!st.isEmpty()){
            rs.append(st.pop());
        }
        return rs.reverse().toString();
        
    }
}