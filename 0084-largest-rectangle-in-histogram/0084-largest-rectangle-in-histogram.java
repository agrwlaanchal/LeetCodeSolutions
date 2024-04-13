class Solution {
    public int largestRectangleArea(int[] arr) {
        int n =arr.length;
        Stack<Integer> st = new Stack<>();
        int res =0;
        
        for(int i=0; i<arr.length; i++){
            
            while(!st.isEmpty()&& arr[st.peek()]>arr[i]){
                int curr = st.pop();
                if(!st.isEmpty()){
                    res = Math.max(res , arr[curr]*(i-st.peek()-1));
                }else{
                    res=Math.max(res, arr[curr]*(i));
                }
            }
            st.push(i);
            
        }
        
        while(!st.isEmpty()){
            int curr = st.pop();
            if(!st.isEmpty()){
                res=Math.max(res, arr[curr]*(n-st.peek()-1));
            }else{
                res= Math.max(res, arr[curr]*(n));
            }
        }
        return res; 
    }
}