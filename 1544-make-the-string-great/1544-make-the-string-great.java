class Solution {
    public String makeGood(String s) {
        
       /* if(s.length()==0){
            return s; 
        }*/
        
        Stack<Character> st = new Stack();
        
        st.push(s.charAt(0));
        for(int i=1; i<s.length();i++){
            char c = s.charAt(i);
            if(!st.isEmpty()){
                //compare peek with char
                if(Math.abs(c-st.peek())==32){
                   
                    st.pop();
                }else{
                    
                    st.push(c);
                }
            }else{
                st.push(c);
            }
        }
        
       StringBuilder str = new StringBuilder();
        
        while(!st.isEmpty()){
            str.insert(0, st.pop());
        }
       // System.out.println(str);
        
        return str.toString();
        
    }
    
   
    
    
}