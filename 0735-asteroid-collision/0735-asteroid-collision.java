class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st  = new Stack<>();
        for(int i=0; i<asteroids.length;i++){
            
            int num = asteroids[i];
           
            if(st.isEmpty()){
                st.push(num);
            }else if(st.peek()>0 && num>0 || (st.peek()<0 && num<0)){
                st.push(num);
            }else{
                
                
                if(st.peek()<0 && num>0){
                    st.push(num);
                }else{
                    while(!st.isEmpty() && ( num<0 && st.peek()>0)){
                    
                      if(Math.abs(st.peek())==Math.abs(num)){
                          st.pop();
                          break;
                      }else if(Math.abs(st.peek())>Math.abs(num)){
                          num = Math.abs(num);
                      }else{
                          st.pop();
                          
                          
                      }
                        
                        if( st.isEmpty()|| !st.isEmpty()&&st.peek()<0){
                            st.push(num);
                        }
                      
                      
                } 
                }
                
                 
            }
                
              
            
        }
        
        int[]res = new int[st.size()];
        for(int i=res.length-1; i>=0;i--){
            res[i]=st.pop();
        }
        return res; 
        
        
    }
}