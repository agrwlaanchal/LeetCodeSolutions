class Solution {
    public int evalRPN(String[] tokens) {
     
        Stack<Integer> st = new Stack<>();
        int res =0 ;
        for(String s: tokens){
            
            
            if(s.equals("+") ){
                int a = st.pop();
                int b=st.pop();
                st.push(b+a);
            }else if(s.equals("-")){
                 int a = st.pop();
                int b=st.pop();
                st.push(b-a);
            }else if(s.equals("*")){
                 int a = st.pop();
                int b=st.pop();
                st.push(b*a);
            }else if(s.equals("/")){
                 int a = st.pop();
                int b=st.pop();
                st.push(b/a);
            }else{
                st.push(Integer.valueOf(s));
            }
               
                
                
            }
        return st.pop();
            
        }
    
    
        
    }
