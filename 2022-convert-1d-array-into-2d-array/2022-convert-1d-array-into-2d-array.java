class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        
        if(m*n!=original.length){
            return new int[0][0];
        }
        
        List<Integer> al = Arrays.stream(original).boxed().toList();
        
        
        
        int[][]res = new int[m][n];
        int index =0; 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int num=al.get(index);
                //System.out.println("num is "+num);
                res[i][j]=num;
                index++;
            }
        }
        return res;
        
        
        
    }
}