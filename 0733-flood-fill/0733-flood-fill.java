class Solution {
    int[][]res;
    public int[][] floodFill(int[][] image, int sr, int sc, int col) {
      
        
      res = new int[image.length][image[0].length];
        for(int i=0;i<res.length;i++){
            Arrays.fill(res[i],-1);
        }
        color(image, sr,sc, col);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                
                if(res[i][j]==-1){
                    res[i][j]=image[i][j];
                }
                
            }
        }
        return res; 
    }
    
    public void color(int[][]image,int i, int j, int col ){
        
        
        res[i][j]=col;
        
        if(i-1>=0 && image[i-1][j]==image[i][j]&&res[i-1][j]==-1){
            color(image, i-1, j, col);
        }
        if(i+1<image.length && image[i+1][j]==image[i][j]&&res[i+1][j]==-1){
            color(image, i+1,j, col);
        }
        
        if(j-1>=0 && image[i][j-1]==image[i][j]&&res[i][j-1]==-1){
            color(image, i, j-1, col);
        }
        
        if(j+1<image[i].length && image[i][j+1]==image[i][j]&&res[i][j+1]==-1){
            color(image, i,j+1, col );
        }
        
        image[i][j]=-1;
        
        
    }
    
}