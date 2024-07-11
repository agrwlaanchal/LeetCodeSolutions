class Solution {
    public String reverseParentheses(String s) {
       
        
        // ( u e v o l i 
        // 
        
        // ) , pop until you get ( 
        // append : reverse 
        // push it back to stack 
        
        // in the end, empty stack  and create the string 
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length();i++){
            char c  =s.charAt(i);
            
            if(c==')'){
                StringBuilder sb =new StringBuilder();
                while(st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
                String temp  = sb.toString();
                for(int j=0;j<temp.length();j++){
                    st.push(temp.charAt(j));
                }
            }else{
                st.push(c);
            }
        }
        
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
        
        
    }
}