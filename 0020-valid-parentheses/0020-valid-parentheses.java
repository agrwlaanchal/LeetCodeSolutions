class Solution {
    public boolean isValid(String s) {
     
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            
            
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }else if(c==')'){
                if(st.isEmpty()) return false;
                
                if(st.peek()!='('){
                    return false;
                }
                st.pop();
                
            } else if(c=='}'){
                
                if(st.isEmpty()) return false;
                
                if(st.peek()!='{'){
                    return false;
                }
                st.pop();
                
            }else if(c==']'){
                
                if(st.isEmpty()) return false;
                
                if(st.peek()!='['){
                    return false;
                }
                st.pop();
                
            }
            
            
        }
        
        if(!st.isEmpty()){
            return false;
        }
        
        return true;
        
        
    }
}