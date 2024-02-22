class Solution {
    public int findJudge(int N, int[][] trust) {
       
        //find indegree of all nodes
        //if any node hvaing idegree = trust length-1 check it's outdegree
        //if outdegree ==0 return that n
        
      
          boolean[] outdeg = new boolean[N+1];
         
        for(int i=0;i<trust.length;i++){
         
            outdeg[trust[i][0]]=true;
            
        }
        
        for(int i=1;i<=N;i++)
        {
            if(outdeg[i]==false){
                //check indegree
                int count=0;
                for(int j=0;j<trust.length;j++){
                    if(trust[j][1]==i)
                        count++;
                }
                if(count==N-1)
                    return i;
            }
        }
        
        return -1;
    }
}