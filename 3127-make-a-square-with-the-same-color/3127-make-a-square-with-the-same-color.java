class Solution {
    public boolean canMakeSquare(char[][] grid) {
     
        //for each cell, check row, if 
        
        for(int i=0;i<grid.length; i++){
            for(int j=0;j<grid[i].length;j++){
            
                int bcount = 0;
                int wcount =0; 
            
                
                if(grid[i][j]=='W'){
                    wcount++;
                }else{
                    bcount++;
                }
                //check remaining neigh
                
                if(i+1<grid.length && j+1<grid[i].length ){
                   
                    if(grid[i+1][j]=='W'){
                        wcount++;
                    }else{
                        bcount++;
                    }
                    
                    if(grid[i][j+1]=='W')
                    {
                        wcount++;
                    }else{
                        bcount++;
                    }
                    
                    if(grid[i+1][j+1]=='W'){
                        wcount++;
                    }else{
                        bcount++;
                    }
                    
                    if(wcount!=bcount){
                        return true;
                    }
                
                }
                
              
                
            }
            
        }
        
        
        return false;
    }
}