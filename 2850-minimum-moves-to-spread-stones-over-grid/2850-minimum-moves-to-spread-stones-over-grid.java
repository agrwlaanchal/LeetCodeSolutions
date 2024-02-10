class Pair{

    int i;
    int j; 
}
class Solution {
    public int minimumMoves(int[][] grid) {


            //for each zero, check the grid where value >1 , try to check moves based on it ,
            // reset the value. \


           boolean flag=true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[i][j]!=1) flag=false;
            }
        }
        if(flag) return 0;


        int ans = 9999;

for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        int k =0 ;
        if(grid[i][j]==0){
           
            for(int a=0;a<3;a++){
                for(int b=0;b<3; b++){

                    if(grid[a][b]>1){
                        grid[a][b]--;
                        grid[i][j]++; 

                        k = k+Math.abs(a-i) +Math.abs(b-j);
                        ans=Math.min(ans, k+minimumMoves(grid));
                        grid[a][b]++;
                        grid[i][j]--;
                    }

                }
            }

        }

    }
}

return ans; 

    }

}