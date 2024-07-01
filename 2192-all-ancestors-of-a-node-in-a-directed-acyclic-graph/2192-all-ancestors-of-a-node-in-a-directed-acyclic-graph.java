class Solution {
      boolean visited[] ;
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
     
        //reverse the edges 
       List<List<Integer>> adj = new ArrayList<>();
       for (int i = 0; i < n; i++) {
          adj.add(new ArrayList<>());
        }

       for (int[] edge : edges) {
          int u = edge[0], v = edge[1];
          adj.get(v).add(u);
       }
        
       List<List<Integer>>  res = new ArrayList<>();
        
       
        for(int i=0;i<n;i++){
            
         visited = new boolean[n];
            
            DFS(i, adj);
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int j=0;j<n;j++){
                if(visited[j] && j!=i){
                    arr.add(j);
                }
            }
            res.add(arr);
            
            
        }
        return res;
    
        
        
        
    }
    
    private void DFS(int u, List<List<Integer>> adj) {
    visited[u]=true;
    for (int v : adj.get(u)) {
      if (!visited[v])
        DFS(v, adj);
    }
    }
        
}