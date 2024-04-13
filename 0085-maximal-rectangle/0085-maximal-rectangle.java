class Solution {
    public int maximalRectangle(char[][] matrix) {
        int result =0;
    
        int[][] arr= new int[matrix.length][matrix[0].length];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                
                if(matrix[i][j]=='0'){
                    arr[i][j]=0;
                }else{
                    arr[i][j]=1;
                }
                
            }
        }
        
     
        
        result = largestRec(arr[0], arr[0].length);
        for(int i=1; i<arr.length;i++){
           
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                   
                    
                    arr[i][j]= arr[i][j]+arr[i-1][j];
                }
            }
            result=Math.max(result, largestRec(arr[i], arr[0].length));
        }
        return result ; 
        
    }
    
    
    public int largestRec(int[]arr, int n){
        
        
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