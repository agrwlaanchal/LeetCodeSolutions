class Solution {
    public boolean isValidSudoku(char[][] board) {

      //get all rows
      // check if duplicate
      // get all columns 
      // check if duplicate 
      // get grid, check if duplicate 

        for(int i=0; i<board.length;i++){

                ArrayList<Character> arr = new ArrayList<>();
                for(char c: board[i]){
                    if(Character.isDigit(c)){
                        arr.add(c);
                    }
                }
                HashSet<Character> hset = new HashSet<>(arr);
                if(hset.size()!=arr.size()){
                    return false;
                }
        }

        for(int i=0;i<board.length;i++){
  ArrayList<Character> arr = new ArrayList<>();
            for(int j=0;j<board[i].length;j++){
                  
                    if(Character.isDigit(board[j][i])){
                        arr.add(board[j][i]);
                    }
            }
            HashSet<Character> hset = new HashSet<>(arr);
                if(hset.size()!=arr.size()){
                    return false;
                }


        }

        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                if (!checkGrid(board, row, col)) {
                    return false;
                }
            }
        }

        return true; 


    }

        private boolean checkGrid (char[][]board, int startRow, int startCol){
 ArrayList<Character> arr = new ArrayList<>();

            for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (Character.isDigit(board[i][j])) {
                    arr.add(board[i][j]);
                }
            }
        }

              HashSet<Character> hset = new HashSet<>(arr);
                if(hset.size()!=arr.size()){
                    return false;
                }
                return true; 
        }

}
