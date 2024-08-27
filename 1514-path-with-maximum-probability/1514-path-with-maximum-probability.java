class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        
        double[] maxProb = new double[n];
        
        maxProb[start_node] = 1.0;
        
        for(int i=0;i<n-1; i++){
          boolean isUpdate = false;
           for(int j=0; j<edges.length;j++){
               
               int u = edges[j][0];
               int v = edges[j][1];
               
               double pathProb = succProb[j];
               if(maxProb[u]*pathProb>maxProb[v] ){
                   maxProb[v]= maxProb[u]*pathProb;
                   isUpdate=true;
               }
               
               if(maxProb[v]*pathProb > maxProb[u]){
                    maxProb[u]= maxProb[v]*pathProb;
                   isUpdate=true;
               }
               
           }
            
            if(!isUpdate){
                break;
            }
            
            
        }
        
        return maxProb[end_node];
        
        
    }
}