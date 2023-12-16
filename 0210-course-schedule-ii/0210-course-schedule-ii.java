class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        
         int indegree[] = new int[numCourses];
        Arrays.fill(indegree, 0);
        
        
        
        List<Integer> adj[] =  new ArrayList[numCourses];
        
        for (int i = 0; i < numCourses; i++)
            adj[i] = new ArrayList<Integer>();
        
        
        
        //ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        
        for(int i=0 ;i<prerequisites.length;i++){
            indegree[prerequisites[i][0]]++;
            adj[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        
        System.out.println(Arrays.toString(indegree));
        
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<indegree.length; i++){
            
            if(indegree[i]==0)
                q.add(i);
            
        }
        
        if(q.size()==0){
       //     System.out.println("q is empty, no vertex with 0 indegree"); 
            return new int[0];
        }
        
        int[]res = new int[numCourses];
        boolean[] visited = new boolean[numCourses];
        
        int index =0 ;
        int count=0 ; 
        while(!q.isEmpty()){
      //      System.out.println("going here");
            int node = q.poll();
            visited[node]=true;
            res[index] = node;
            index++;
            
            for(int u: adj[node]){
                
                if(!visited[u] ){
                    indegree[u]--;
                    if(indegree[u]==0){
                        q.add(u);
                       
                    }
                }
                 
                
            }
            
            count++;
            
        }
        
        
        
      //  System.out.println("count is "+ count);
        if(count!=numCourses)
            return new int[0];
        return res; 
        
        
        
        
        
        
    }
}