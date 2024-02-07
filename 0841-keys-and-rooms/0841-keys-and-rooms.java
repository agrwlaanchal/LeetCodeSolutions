class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean visited[] = new boolean[rooms.size()];
        dfs(rooms, 0 , visited);

        for(int i=0;i<visited.length;i++){
            if(!visited[i])
            return false;
        }

        return true; 
      

    }


    public void dfs(List<List<Integer>> rooms, int source, boolean[] visited){

        visited[source]=true;


        List<Integer> arr = rooms.get(source);

        for(int i : arr){

                if(!visited[i]){

                    dfs(rooms, i, visited);

                }

        }

    }
}