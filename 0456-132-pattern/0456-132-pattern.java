class Solution {
    public boolean find132pattern(int[] nums) {
        
        if(nums.length<3){
            return false;
        }
       
        int[]min = new int[nums.length];
        min[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            min[i]=Math.min(min[i-1], nums[i]);
        }
        
        //decreasing stack
        Stack<Integer> st = new Stack<>();
        
        st.push(0);
        
        for(int i=1;i<nums.length;i++){
            
            while(!st.isEmpty()&&nums[st.peek()]<=nums[i]){
                st.pop();
            }
            
            if(!st.isEmpty() && min[st.peek()]<nums[i]){
                return true;
            }
            
            st.push(i);
            
            
        }
        
       return false;
        
    }
}