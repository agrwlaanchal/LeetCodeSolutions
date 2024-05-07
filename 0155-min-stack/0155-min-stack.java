

class MinStack {
  private Stack<Integer> stack ; 
    private Stack<Integer> minStack ;

    
    public MinStack() {
         stack = new Stack<>();
        minStack  = new Stack<>();
    }
    
    public void push(int val) {
     
        if(stack.isEmpty()){
            stack.push(val);
            minStack.push(val);
        }else if(minStack.peek()>=val){
            stack.push(val);
            minStack.push(val);
        }else{
            stack.push(val);
        }
        
    }
    
    public void pop() {
      
        if(stack.peek().equals(minStack.peek())){
            stack.pop();
            minStack.pop();
        }else{
            stack.pop();
        }
        
    }
    
    public int top() {
        
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */