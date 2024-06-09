class Solution {
    public int valueAfterKSeconds(int n, int k) {
     
        
        int [][] arr = new int[k+1][n];
        int num = (int)Math.pow(10,9)+7;
        
        //fill first row
        Arrays.fill(arr[0],1);
        
        for(int i=0;i<=k;i++){
            arr[i][0]=1;
        }
        
      /*  for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }*/
        
        for(int i=1; i<arr.length;i++){
            for(int j=1; j<arr[i].length;j++){
                
                arr[i][j] = (arr[i][j-1]+arr[i-1][j])%num;
                //System.out.println(arr[i][j]);
            }
        }
        
     /*   for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
       */ 
        int col = arr[0].length-1;
        return arr[arr.length-1][col];
        
    }
}