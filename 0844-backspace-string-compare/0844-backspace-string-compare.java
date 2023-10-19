class Solution {
    public boolean backspaceCompare(String s, String t) {
     
     
        //make stack 
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='#' ){
                if(!st.isEmpty()){
                st.pop();
                }
            }else{
                st.push(c);
            }
        }
        
        
        
        Stack<Character> st2 = new Stack<>();
        
        for(int i=0; i<t.length();i++){
            char c = t.charAt(i);
            if(c=='#' ){
               if( !st2.isEmpty()){
                st2.pop();
               }
            }else{
                st2.push(c);
            }
        }
        
        
        String s1 = "";
        while(!st.isEmpty()){
            s1=s1+st.pop();
        }
        System.out.println(s1);
        String s2 = "";
        while(!st2.isEmpty()){
            s2=s2+st2.pop();
        }
        System.out.println(s2);
        return s1.equals(s2);
        
        
        
        
    }
}