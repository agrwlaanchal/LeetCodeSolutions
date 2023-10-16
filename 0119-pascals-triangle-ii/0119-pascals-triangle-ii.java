class Solution {
    public List<Integer> getRow(int rowIndex) {
       
        
       
        int[][]mat = new int[rowIndex+1][];
        
        for(int i=0;i<mat.length;i++){
            mat[i] = new int[i+1];
            
            if(i==0){
                mat[i][0]=1;
            }else{
               for(int j=0;j<mat[i].length;j++){
                   int index = j;
                   int num=0;
                   if(mat[i-1].length>index){
                       num = num+mat[i-1][index];
                   }
                   index =  j-1;
                   if(index>=0 && mat[i-1].length>index){
                       num = num+mat[i-1][index];
                   }
                   mat[i][j] = num;
               }
            }
            
        }
        
      /*  for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }*/
        
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<mat[rowIndex].length ;i++){
            res.add(mat[rowIndex][i]);
        }
        return res ;
        
        
    }
}