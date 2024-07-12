class Solution {
     Stack<Character> st = new Stack<>();
    
    
    public int maximumGain(String s, int x, int y) {
        int score=0;
      
        if(x>y){            
            score=score+removeUsingStack( 'a','b', x,s); //remove ab first
            score=score+removeusingString( 'b','a',y); //remove ba later
            return score;             
        }else{
            score=score+removeUsingStack( 'b','a', y,s); //remove ba first
            score=score+removeusingString( 'a','b',x); //remove ab later
            return score; 
        }  
    }
    
    public int removeUsingStack( char first, char second, int point, String s){
         int score =0;    
        for(int i=0; i<s.length();i++){
                char c= s.charAt(i);
            
                if(c==second){
                    if(!st.isEmpty() && st.peek()==first){
                        st.pop();
                        score=score+point;
                    }else{
                        st.push(c);
                    }
                }else{
                    st.push(c);
                }
            }
        return score;
    }
    
    public int removeusingString(char second, char first, int point){
         StringBuilder sb = new StringBuilder();
        int score =0;  
        while(!st.isEmpty()){
                char c = st.pop();
                 if(c==second){
                     if(sb.length()>0 && sb.charAt(sb.length() - 1)==first){
                          sb.deleteCharAt(sb.length() - 1);
                         score=score+point;
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