class Solution {
    public int findCircleNum(int[][] isConnected) {

     //no of times we call dFS is provinces .

     boolean visited []=new boolean[isConnected.length+1];
    int count=0; 
    visited[0]=true; 
        for(int i=1; i<visited.length;i++){

            if(!visited[i]){
                dfs(isConnected, visited, i);
                count++;
            }

        }

        return count; 


    }

    public void dfs(int[][]connected, boolean[]visited, int source){

        if(source>visited.length)
        return; 


        visited[source]=true;

        for(int i=0; i<connected[source-1].length; i++){
          //    System.out.println(source-1 +" "+i);
                if(connected[source-1][i]==1 && !visited[i+1]){
                   
                    dfs(connected, visited, i+1);
                }

        }

    }

}