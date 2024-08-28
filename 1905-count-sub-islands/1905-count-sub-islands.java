class Pair{
    int i;
    int j;
    
    Pair(int in, int jn ){
        i=in;
        j=jn;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return i == pair.i && j == pair.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }
    
}

class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        
        //count islands in grid1 and save their points
        
        ArrayList<ArrayList<Pair> > arr = new ArrayList<>();
        
        boolean visited[][] = new boolean[grid1.length][grid1[0].length];
        
        
        for(int i=0;i<grid1.length;i++){
            for(int j=0; j<grid1[i].length;j++){
                
                if(grid1[i][j]==1 && !visited[i][j]){
                    ArrayList<Pair>  temp = new ArrayList<>();
                   temp =  dfs(i, j, grid1, visited, temp);
                    arr.add(temp);
                }
                
            }
        }
        
        Set<Pair> allIslands1 = new HashSet<>();
        for (ArrayList<Pair> island : arr) {
            allIslands1.addAll(island);
        }
        
          int res= 0; 
        
        ArrayList<ArrayList<Pair> > arr2 = new ArrayList<>();
        
        boolean visited2[][] = new boolean[grid2.length][grid2[0].length];
        
        
        for(int i=0;i<grid2.length;i++){
            for(int j=0; j<grid2[i].length;j++){
                
                if(grid2[i][j]==1 && !visited2[i][j]){
                    ArrayList<Pair>  temp = new ArrayList<>();
                    temp= dfs(i, j, grid2, visited2, temp);
                   if(allIslands1.containsAll(temp))
                       res++;
                    /* for(ArrayList<Pair> toCompare: arr){
                
                       Set<Pair> set1 = new HashSet<>(toCompare);
                        if(toCompare.containsAll(temp)){
                           res++;
                    
                        }
                    
                
            }*/
                }
                
            }
        }
        
    /*  for(ArrayList<Pair>  a : arr ){
           for(Pair p: a){
               System.out.print("("+p.i+" "+p.j+") ");
           }
           System.out.print("----------------");
       } 
        
        System.out.println();
        
        for(ArrayList<Pair>  a : arr2 ){
           for(Pair p: a){
               System.out.print("("+p.i+" "+p.j+") ");
           }
             System.out.print("----------------");
       } */
      
        /*for(ArrayList<Pair> a: arr2){
            
            for(ArrayList<Pair> toCompare: arr){
                
                Set<Pair> set1 = new HashSet<>(toCompare);
                if(toCompare.containsAll(a)){
                    res++;
                    break;
                }
                    
                
            }
        }*/
        
        return res;
    }
    
    public ArrayList<Pair>  dfs(int i, int j, int[][] grid, boolean[][]visited, ArrayList<Pair>  temp ){
    
    visited[i][j]=true;
    
    temp.add(new Pair(i, j));
    
    if(j-1>=0 && j-1<grid[i].length&& grid[i][j-1]==1&&!visited[i][j-1])
        dfs(i, j-1, grid, visited, temp);
        
    if(j+1<grid[i].length && grid[i][j+1]==1 && !visited[i][j+1])
        dfs(i,j+1, grid, visited, temp);
    
    if(i+1<grid.length && grid[i+1][j]==1 && !visited[i+1][j])
        dfs(i+1, j, grid, visited,temp);   
    
    if(i-1>=0&& i-1<grid.length&&grid[i-1][j]==1&&!visited[i-1][j])
        dfs(i-1, j, grid, visited,temp);
        
    return temp;
}
    
}




