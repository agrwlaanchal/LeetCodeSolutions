class Solution {
    public int maximumGain(String s, int x, int y) {
    
        int score=0;
       //do it with stack 
        Stack<Character> st = new Stack<>();
        if(x>y){
            //remove ab first 
            // make a stack 
            // when poping from stack 
            // b a 
            // it comes ab 
            // remove ab again 
            for(int i=0; i<s.length();i++){
                char c= s.charAt(i);
                // removing ab 
                if(c=='b'){
                    if(!st.isEmpty() && st.peek()=='a'){
                        st.pop();
                        score=score+x;
                    }else{
                        st.push(c);
                    }
                }else{
                    st.push(c);
                }
            }
            
            //pop stack and form string and again remove ab, add y to score 
            StringBuilder sb = new StringBuilder();
            while(!st.isEmpty()){
                char c = st.pop();
                 if(c=='b'){
                     if(sb.length()>0 && sb.charAt(sb.length() - 1)=='a'){
                          sb.deleteCharAt(sb.length() - 1);
                         score=score+y;
                     }else{
                         sb.append(c);
                     }
                 }else
                 {
                     sb.append(c);
                 }
            }
            return score; 
            
        }else{
            //same process for ba. 
            for(int i=0; i<s.length();i++){
                char c= s.charAt(i);
                // removing ab 
                if(c=='a'){
                    if(!st.isEmpty() && st.peek()=='b'){
                        st.pop();
                        score=score+y;
                    }else{
                        st.push(c);
                    }
                }else{
                    st.push(c);
                }
            }
            
            //pop stack and form string and again remove ab, add y to score 
            StringBuilder sb = new StringBuilder();
            while(!st.isEmpty()){
                char c = st.pop();
                 if(c=='a'){
                     if(sb.length()>0 && sb.charAt(sb.length() - 1)=='b'){
                          sb.deleteCharAt(sb.length() - 1);
                         score=score+x;
                     }else{
                         sb.append(c);
                     }
                 }else
                 {
                     sb.append(c);
                 }
            }
            return score; 
        }
        
        
    }
}