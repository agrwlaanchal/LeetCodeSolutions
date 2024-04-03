class Solution {
    public boolean exist(char[][] board, String word) {
        
        
        char c = word.charAt(0);
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length;j++){
                
                if(board[i][j]==c){
                    boolean[][] visited = new boolean[board.length][board[0].length];
        
                      for(int k=0; k<board.length;k++){
                            Arrays.fill(visited[k], false);
                      }
                    visited[i][j]=true;
                   // System.out.println("[i][j]"+" "+i+" "+j);
                      if(issafe(i, j, board, visited, word,1)){
                        return true;
                      }
                }
                
            }
        }
        return false;
        
    }
    
    
    public boolean issafe(int i, int j, char[][]board, boolean[][]visited, String word, int index){
     
        //System.out.println(i+" "+j+" "+index);   
     
        if(index==word.length()){
            return true;
        }
        
        if(i==board.length && j==board[0].length){
            return false;
        }
        
        
        if(i+1<board.length && board[i+1][j]==word.charAt(index) && visited[i+1][j]==false){
            visited[i+1][j]=true;
            //System.out.println("going here and calling for  "+ (i+1) +" "+j);
            if(issafe(i+1,j,board, visited, word, index+1))
                return true; 
            visited[i+1][j]=false;
        }
        
        if(j+1<board[i].length && board[i][j+1]==word.charAt(index)&& visited[i][j+1]==false){
            visited[i][j+1]=true;
          //   System.out.println("going here and calling for  "+ (i) +" "+(j+1));
            if(issafe(i,j+1,board, visited, word, index+1))
                return true;
            visited[i][j+1]=false;
        }
        
        if(j-1>=0 && j-1<board[i].length&& board[i][j-1]==word.charAt(index)&& visited[i][j-1]==false){
            visited[i][j-1]=true;
           //  System.out.println("going here and calling for  "+ (i) +" "+(j+1));
            if(issafe(i,j-1,board, visited, word, index+1))
                return true;
            visited[i][j-1]=false;
        }
        
        if(i-1>=0 && i-1<board.length && board[i-1][j]==word.charAt(index) && visited[i-1][j]==false){
            visited[i-1][j]=true;
         //   System.out.println("going here and calling for  "+ (i+1) +" "+j);
            if(issafe(i-1,j,board, visited, word, index+1))
                return true; 
            visited[i-1][j]=false;
        }
        
        
        return false;
        
        
        
    }
    
    
}