class Solution {
    public List<String> buildArray(int[] target, int n) {
     
       int j=0;
        int i=1;
        
        List<String> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        while(i<=n && j<target.length){
            
            int num =i;
            
            st.push(num);
            res.add("Push");
            if(!st.isEmpty()&&st.peek()!=target[j]){
                st.pop();
                res.add("Pop");
            }
            
            if(!st.isEmpty()&&st.peek()==target[j]){
                j++;
            }
            i++;
            
        }
        return res;
    }
}