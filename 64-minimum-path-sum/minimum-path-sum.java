class Solution {
    public int minPathSum(int[][] grid) {


        int[][]dp = new int[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            Arrays.fill(dp[i], 0);
        }

        dp[0][0]=grid[0][0];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length;j++){

                 if(i==0 && j==0)
                 continue; 

                        int sum1=99999;
                    if(i-1>=0 && i-1<grid.length ){
                        sum1= dp[i-1][j];
                    }
                    int sum2=99999;
                    if(j-1>=0 && j-1<grid[0].length){
                            sum2= dp[i][j-1];
                    }
                    dp[i][j]=grid[i][j]+Math.min(sum1, sum2);

                

            }
        }

    /*   for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }*/
        return dp[dp.length-1][dp[0].length-1];

    

    }

}