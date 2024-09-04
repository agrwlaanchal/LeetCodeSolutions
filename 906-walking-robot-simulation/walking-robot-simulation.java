class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        
        int x =0; 
        int y =0;
        int d =0;
        
        int res =0;
          int[][] direction={{0,1},{1,0},{0,-1},{-1,0}}; //up, right, down, left
        HashSet<String> hset = new HashSet<>();
        for(int[]arr :obstacles ){
            hset.add(arr[0]+","+arr[1]);
        }
        
        
        for(int i=0;i<commands.length;i++){
            int x1 = commands[i];
            if(x1==-1){
                d = (d+1)%4;
            }else if(x1 ==-2){
                d = (d+3)%4;
            }else{
                
                for(int j=0; j<x1;j++){
                    
                    int tempx = x+direction[d][0];
                    int tempy = y+direction[d][1];
                    if(hset.contains(tempx+","+tempy))
                        break;
                    
                    x = tempx;
                    y=tempy;
                    res= Math.max(res, x*x+y*y);
                    
                }
                
            }
            
            
        }
        return res; 
        
        
    }
}