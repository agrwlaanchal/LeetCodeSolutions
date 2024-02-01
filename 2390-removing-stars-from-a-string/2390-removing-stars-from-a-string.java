class Solution {
    public String removeStars(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0 ;i<s.length();i++){
            
            if(s.charAt(i)=='*'){
                
                if(!st.isEmpty()){
                    st.pop();
                }
                
            }else{
                st.push(s.charAt(i));
            }
            
            
        }
        
        
        String temp = "";
        while(!st.isEmpty()){
            temp=temp+st.pop();
        }
        
        String res="";
        for(int i=temp.length()-1;i>=0;i--){
            res=res+temp.charAt(i);
        }
        return res; 
        
        
    }
}