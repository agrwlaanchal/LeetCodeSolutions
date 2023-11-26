class Solution {
    public int largestSubmatrix(int[][] matrix) {
     
    
        int res = getMaxArea(matrix[0], matrix[0].length);
        
        for(int i =1; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length ; j++){
                
                if(matrix[i][j]==1){
                    matrix[i][j] += matrix[i-1][j];
                }
                
            }
            
        }
        
        
        int maxarea = 0;
        
        for(int i=0 ; i<matrix.length ;i++){
            Arrays.sort(matrix[i]);
            maxarea = Math.max(maxarea, getMaxArea(matrix[i], matrix[i].length));
        }
        return maxarea; 
         
    }
    
    
    
    public int getMaxArea(int hist[], int n) 
    { 
        // Create an empty stack. The stack holds indexes of 
        // hist[] array The bars stored in stack are always 
        // in increasing order of their heights. 
        Stack<Integer> s = new Stack<>(); 
  
        int max_area = 0; // Initialize max area 
        int tp; // To store top of stack 
        int area_with_top; // To store area with top bar as 
                           // the smallest bar 
  
        // Run through all bars of given histogram 
        int i = 0; 
        while (i < n) { 
            // If this bar is higher than the bar on top 
            // stack, push it to stack 
            if (s.empty() || hist[s.peek()] <= hist[i]) 
                s.push(i++); 
  
            // If this bar is lower than top of stack, then 
            // calculate area of rectangle with stack top as 
            // the smallest (or minimum height) bar. 'i' is 
            // 'right index' for the top and element before 
            // top in stack is 'left index' 
            else { 
                tp = s.peek(); // store the top index 
                s.pop(); // pop the top 
  
                // Calculate the area with hist[tp] stack as 
                // smallest bar 
                area_with_top 
                    = hist[tp] 
                      * (s.empty() ? i : i - s.peek() - 1); 
  
                // update max area, if needed 
                if (max_area < area_with_top) 
                    max_area = area_with_top; 
            } 
        } 
  
        // Now pop the remaining bars from stack and 
        // calculate area with every popped bar as the 
        // smallest bar 
        while (s.empty() == false) { 
            tp = s.peek(); 
            s.pop(); 
            area_with_top 
                = hist[tp] 
                  * (s.empty() ? i : i - s.peek() - 1); 
  
            if (max_area < area_with_top) 
                max_area = area_with_top; 
        } 
  
        return max_area; 
    }
}