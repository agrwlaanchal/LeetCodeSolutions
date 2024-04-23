class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
     
        //create adj matrix
        // create indegree array. 
          ArrayList<Integer> res = new ArrayList<>();
        if (n == 1) {
            res.add(0);
            return res;
        }
        
        int[]deg = new int[n];
        
        ArrayList<ArrayList> arr = new ArrayList<>();
        for(int i=0; i<n;i++){
            arr.add(new ArrayList<>());
        }
        
        
        for(int i=0; i<edges.length;i++){
            arr.get(edges[i][0]).add(edges[i][1]);
            arr.get(edges[i][1]).add(edges[i][0]);
            deg[edges[i][0]]++;
            deg[edges[i][1]]++;
        }
        
       /* for(int i=0; i<arr.size();i++){
            
            System.out.print(i+" ");
            for(int j=0;j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
                
            }
            System.out.println();
            
        }
        
        System.out.println(Arrays.toString(deg));*/
        
        Queue<Integer> q = new LinkedList<>();
       
        for(int i=0; i<n;i++){
            if(deg[i]==1){
                q.offer(i);
            }
        }
        
        
        while(n>2){
            
            
            int num = q.size();
            n=n-num;
            for(int i=0 ; i<num; i++){
                
                int  p = q.poll();
                //System.out.println("poll "+p);
                deg[p]--;
                ArrayList<Integer> temp = arr.get(p);
                for(int nu:  temp){
                    
                    deg[nu]--;
                    if(deg[nu]==1){
                 //   System.out.println("adding "+nu );
                        q.offer(nu);
                    }
                    
                }
                
            }
            
        }
        
        
      
        
        while(!q.isEmpty()){
            res.add(q.poll());
        }
        return res;
        
    }
}