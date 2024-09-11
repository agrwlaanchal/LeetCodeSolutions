class Solution {
    public void rotate(int[] nums, int k) {
     
         k = k % nums.length;
        Stack<Integer> st = new Stack<>();
        
        int count = 0;
        int i=nums.length-1;
        while(i>=0&& count<k){
            st.push(nums[i]);
            count++;
            i--;
        }
        
        while(i>=0){
            nums[i+k]=nums[i];
            i--;
        }
        int t=0;
        while(!st.isEmpty()){
            nums[t]=st.pop();
            t++;
        }
        
        
        
    }
}