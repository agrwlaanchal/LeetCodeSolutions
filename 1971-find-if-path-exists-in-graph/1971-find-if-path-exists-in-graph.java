class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
     List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        /*for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }*/
        
        boolean []visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);  
        visited[source] = true;
     
        
        
        
        while(!q.isEmpty() ){
            
            int n1 = q.poll();
         
            if(n1==destination){
                return true;
            }
            for (int neighbor : graph.get(n1)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
            
        }
        
        
        return false;
        
    }
}