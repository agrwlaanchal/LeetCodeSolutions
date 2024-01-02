class Solution {
    public String addStrings(String num1, String num2) {
     
        
        int i=num1.length()-1;
        int j =num2.length()-1;
        
        int carry =0 ;
        Stack<Integer> st = new Stack<>();
        while(i>=0 && j>=0){
            
            int temp = Integer.valueOf(""+num1.charAt(i)) + Integer.valueOf(""+num2.charAt(j)) +carry;
            
            st.push(temp%10);
            carry=temp/10;
            i--;
            j--;
            
        }
        
        while(i>=0){
            int temp = Integer.valueOf(""+num1.charAt(i)) + +carry;
            
            st.push(temp%10);
            carry=temp/10;
            i--;
        }
        
        while(j>=0){
              int temp = Integer.valueOf(""+num2.charAt(j)) +carry;
            
            st.push(temp%10);
            carry=temp/10;
            j--;
        }
        
        if(carry>0){
            st.push(carry);
        }
        
        String s = "";
        while(!st.isEmpty()){
            s=s+st.pop();
        }
        return s; 
        
    }
}