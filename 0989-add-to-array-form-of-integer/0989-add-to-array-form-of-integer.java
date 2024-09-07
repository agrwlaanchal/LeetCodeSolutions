class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
     
        int carry= 0;
        Stack<Integer> st = new Stack<>();
        int i= num.length-1;
        while(i>=0 && k>0){
            int temp = num[i]+(k%10)+carry;
            k=k/10;
            st.push(temp%10);
            carry = temp/10;
            i--;
        }
        
        while(i>=0){
             int temp = num[i]+carry;
           
            st.push(temp%10);
            carry = temp/10;
            i--;
        }
        
        while(k>0){
             int temp = (k%10)+carry;
            k=k/10;
            st.push(temp%10);
            carry = temp/10;
            i--;
        }
        
        if(carry>0)
           st.push(carry);
        
        List<Integer>res = new ArrayList<>();
        while(!st.isEmpty())
        {
            res.add(st.pop());
        }
        
        return res;
        
        
        
    }
}