class Solution {
    public String removeStars(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0 ;i<s.length();i++){
            
            if(s.charAt(i)=='*'){
                
               // if(!st.isEmpty()){
                    st.pop();
                //}
                
            }else{
                st.push(s.charAt(i));
            }
            
            
        }
        
        
        char[] arr = new char[st.size()];
        
        
        for(int i=arr.length-1; i>=0;i--){
            arr[i]=st.pop();
        }
        
        return new String(arr);
        
        
    }
}