class Solution {
    public boolean winnerOfGame(String colors) {
     
        
        int scoreA = 0;
        int scoreB = 0; 
        for(int i=1;i<colors.length()-1; i++){
            char c = colors.charAt(i);
            if(c=='A' && colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A'){
                scoreA++;
            } 
            if(c=='B' && colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B'){
                scoreB++;
            }
        }
        if(scoreA > scoreB){
            return true;
        } else{
            return false;
        }
    }
}