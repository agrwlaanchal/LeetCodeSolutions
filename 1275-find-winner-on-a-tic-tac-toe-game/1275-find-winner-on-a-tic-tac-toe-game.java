class Solution {
    public String tictactoe(int[][] moves) {
     
       int[][] res = new int[3][3];
        
        for(int i=0;i<res.length;i++){
            Arrays.fill(res[i], -1);    
        }
        
        for(int i=0;i<moves.length;i=i+2){
            int row = moves[i][0];
            int col = moves[i][1];
            res[row][col] = 1;
        }
        
        for(int i=1;i<moves.length;i=i+2){
            int row = moves[i][0];
            int col = moves[i][1];
            res[row][col] = 0;
        }
        
        /*for(int i=0;i<res.length;i++){
        System.out.println(Arrays.toString(res[i]));
        }*/
        
        
        //check for rows
        for(int i=0;i<res.length;i++){
            String s="";
           for(int j=0;j<res[i].length;j++){
               s=s+res[i][j];
           }
            if(s.equals("111")){
                return "A";
            }else if(s.equals("000")){
                return "B";
            }
        }
        
        for(int i=0;i<res.length;i++){
            String s="";
           for(int j=0;j<res[i].length;j++){
               s=s+res[j][i];
           }
          if(s.equals("111")){
                return "A";
            }else if(s.equals("000")){
                return "B";
            }
        }
        
        
        if(res[0][0]!=-1&&res[1][1]!=-1&&res[2][2]!=-1){
            String s = ""+res[0][0]+res[1][1]+res[2][2];
            //System.out.println("s is "+s);
            if(s.equals("111")){
                return "A";
            }else if(s.equals("000")){
                return "B";
            }
        }
        
        if(res[0][2]!=-1&&res[1][1]!=-1&&res[2][0]!=-1){
            String s = ""+res[0][2]+res[1][1]+res[2][0];
        //  System.out.println("s is "+s);
            if(s.equals("111")){
                return "A";
            }else if(s.equals("000")){
                return "B";
            }
        }
        
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                if(res[i][j]==-1){
                    return "Pending";
                }
            }
        }
        
        return "Draw";
    }
}