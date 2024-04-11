class Solution {
    public String removeKdigits(String nums, int k) {
     
        if(k==0){
            return nums;
        }
        
        if(k>=nums.length()){
            return "0";
        }
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<nums.length();i++){
            
            char c =nums.charAt(i);
           
            
            while(!st.isEmpty()&& st.peek()>c &&k>0){
                int n = st.pop();
                if(n!=0){
                    
                    k--;
                }
               
            }
             st.push(c);
            
        }
        
        while(k>0){
            st.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(""+st.pop());
        }
        
        //System.out.println(sb.reverse());
         String res =  sb.reverse().toString();
        int index=0;
        while(index<res.length()&&res.charAt(index)=='0'){
            index++;
        }
        if(index>=res.length()){
            return "0";
        }
        return res.substring(index);
        
    }
}