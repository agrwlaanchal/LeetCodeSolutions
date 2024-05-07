class Solution {
    public int[] nextGreaterElements(int[] nums) {
     
  
        
        int[]res= new int[nums.length];
        Arrays.fill(res,Integer.MIN_VALUE);
        Stack<Integer> st = new Stack<>();
        
        for(int i=nums.length-1; i>=0;i--){
            
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            } 
            
            if(st.isEmpty()){
                res[i]=Integer.MIN_VALUE;
            }else{
                res[i]=st.peek();
            }
            
            st.push(nums[i]);
            
            
        }
        
        for(int i=nums.length-1;i>=0;i--){
            
            if(res[i]==Integer.MIN_VALUE){
              
                while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            } 
                
                if(st.isEmpty()){
                    res[i]=-1;
                } else if(st.peek()==nums[i]){
                    res[i]=-1;
                }else{
                  res[i]=st.peek();  
                }
                
                
                
                
            }
            
            
        }
        
        return res;
        
       
    }
}