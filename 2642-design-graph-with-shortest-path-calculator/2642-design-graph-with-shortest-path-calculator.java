class Graph {

    int [][] g ; 
    public Graph(int n, int[][] edges) {
        
        g =new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(g[i], 0);
        }
        
        for(int i=0;i<edges.length ;i++){
            g[edges[i][0]][edges[i][1]] = edges[i][2];
        }
        
    }
    
    public void addEdge(int[] edge) {
        
      //  System.out.println("inside addEdge "+edge.length);
        g[edge[0]][edge[1]] = edge[2];
    }
    
    public int shortestPath(int node1, int node2) {
     
        int V = g.length;
        int []dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        dist[node1] = 0;
        
        boolean visited[] = new boolean[V];
        
        for(int count=0; count<V-1; count++){
            int u=-1;
            for(int i=0; i<V; i++){
                if(!visited[i] && (u==-1 || dist[i] <dist[u])){
                    u=i;
                }
            }
            
                visited[u]  = true;
                for(int v=0 ; v<V ; v++){
                    if(!visited[v] && g[u][v]!=0 ){
                        dist[v] = Math.min(dist[v], dist[u] + g[u][v]);
                    }
                }
            }
        
        if(dist[node2] == Integer.MAX_VALUE || dist[node2]<0)
            return -1;
        return dist[node2];
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */