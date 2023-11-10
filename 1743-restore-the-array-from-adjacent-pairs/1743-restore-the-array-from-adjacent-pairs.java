class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
     
    //   HashMap<Integer, Integer> hmap  = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> arr =  new HashMap<>();
        int source = 0;
      HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int[] edge: adjacentPairs){
            
         if(hmap.containsKey(edge[0])){
             hmap.put(edge[0], hmap.get(edge[0])+1);
         } else{
             hmap.put(edge[0],1);
         }
            
            if(hmap.containsKey(edge[1])){
             hmap.put(edge[1], hmap.get(edge[1])+1);
         } else{
             hmap.put(edge[1],1);
         }
            
            if(arr.containsKey(edge[0])){
                ArrayList<Integer> temp = arr.get(edge[0]);
                temp.add(edge[1]);
                arr.put(edge[0], temp);
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                 temp.add(edge[1]);
                arr.put(edge[0], temp);
            }
            
            
           
            if(arr.containsKey(edge[1])){
                  ArrayList<Integer> temp = arr.get(edge[1]);
                 temp.add(edge[0]);
                arr.put(edge[1], temp);
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                 temp.add(edge[0]);
                arr.put(edge[1], temp);
            }
            
         
            
            
        }
        
        //find the source now 
        HashSet<Integer> vert = new HashSet<>();
        
        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
           // System.out.println(entry.getKey() +" "+entry.getValue());
            vert.add(entry.getKey());
            if(entry.getValue()==1)
                source = entry.getKey();
        }
        
      //  System.out.println("source is "+source);
        ArrayList<Integer> res = new ArrayList<>();
      res =   DFS(arr, res, vert, source);
        
   //     System.out.println(res);
       
        int[]result = new int[res.size()];
        int i=0;
        for(int u:res){
            result[i]  =u;
            i++;
        }
        return result;
        
    }
    
    public ArrayList<Integer> DFS (HashMap<Integer, ArrayList<Integer> > arr , ArrayList<Integer> res ,HashSet<Integer >vert, int source ){
     
        vert.remove(source);
        res.add(source);
        
        ArrayList<Integer> temp = arr.get(source);
       if(temp!=null){
        for(int u: temp){
            if(vert.contains(u)){
                DFS(arr, res, vert, u);
            }
        }
       }
        
        return res; 
    }
    
    
    
}