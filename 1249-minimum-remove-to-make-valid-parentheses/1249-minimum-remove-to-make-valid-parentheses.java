class Solution {
    public String minRemoveToMakeValid(String s) {
     
        int count =0;
        int leftcount =0;
        int rightcount =0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            
            
            char c = s.charAt(i);
            if(c=='('){
                leftcount++;
                st.push(c);
            }else if(c==')'){
                rightcount++;
                if(rightcount>leftcount){
                    count++;
                    rightcount--;
                }else{
                    st.push(c);
                }
            }else{
                st.push(c);
            }
            
        }
        StringBuilder sb1 = new StringBuilder();
        while(!st.isEmpty()){
            sb1.append(st.pop());
        }
        s = sb1.toString();
      //  System.out.println("s is "+s);
        
        leftcount =0;
        rightcount =0; 
        for(int i=0;i<s.length();i++){
            
            
            char c = s.charAt(i);
            if(c==')'){
                rightcount++;
                st.push(c);
            }else if(c=='('){
                leftcount++;
                if(rightcount<leftcount){
                    count++;
                    leftcount--;
                }else{
                    st.push(c);
                }
            }else{
                st.push(c);
            }
            
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.toString();
        
        
        
        
        
    }
}