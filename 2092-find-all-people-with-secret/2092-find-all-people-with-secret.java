class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        
        
        Map<Integer, List<int[]>> graph = new HashMap<>();
        
        for (int i=0; i < n; i++){
            graph.put(i, new ArrayList<int[]>());
        }
        
        for (int[] mtg : meetings){
            graph.get(mtg[0]).add(new int[] {mtg[1],mtg[2]} );
            graph.get(mtg[1]).add(new int[] {mtg[0],mtg[2]} );
        }
        
        
        PriorityQueue<int[]>q = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        
        q.add(new int[]{0,0});
        q.add(new int[]{firstPerson,0});
        
        HashSet<Integer> hset = new HashSet<>();
         
        while(!q.isEmpty()){
            
             int[] persontime = q.poll();
            int person = persontime[0];
            if(hset.contains(person))
                continue;
            
            hset.add(person);
          List<int[]> arr = graph.get(person);
            for(int[]temp : arr){
                if(temp[1]>=persontime[1] && !hset.contains(temp[0])){
                    //person can know the secret and time is valid               
                     q.offer(new int[]{temp[0],temp[1]});
                }
            }
            
            
            
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num: hset){
            arr.add(num);
        }
      
        return arr; 
        
        
    }
    
    
    
}