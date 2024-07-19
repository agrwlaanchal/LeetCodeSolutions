class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        // check min number in each row 
        // if we are at min number 
        // get min of each column 
        
        
        int rowmin [] =new int[matrix.length];
        //Arrays.fill(rowmin , Integer.MAX_VALUE);
        int colmin [] = new int[matrix[0].length];
         //Arrays.fill(colmin , Integer.MAX_VALUE);
        for(int i=0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
                
            }
            rowmin[i] = min;
        }
        
        
        for(int i=0;i<matrix[0].length;i++){
            int min = Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]>min){
                    min = matrix[j][i];
                }
            }
            colmin[i]=min;
            
        }
        
      //  System.out.println(Arrays.toString(rowmin));
        
        //System.out.println(Arrays.toString(colmin));
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                
                if(matrix[i][j]==rowmin[i] && matrix[i][j]==colmin[j]){
                    res.add(matrix[i][j]);
                }
            }
        }
        return res; 
        
        
        
        
    }
}