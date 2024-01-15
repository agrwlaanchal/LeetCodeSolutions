class Pair{
    int win;
    int loss; 
}

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        TreeMap<Integer, Pair> hmap = new TreeMap<>();
     
        for(int i=0; i<matches.length;i++){
            
            
            int winner = matches[i][0];
            int loser  =  matches[i][1];
            
            
            if(!hmap.containsKey(winner)){
                Pair p =new Pair();
                p.win = 1;
                p.loss =0 ;
                hmap.put(winner, p);
            }else{
                Pair p = hmap.get(winner);
                p.win = p.win+1;
                hmap.put(winner, p);
            }
            
             if(!hmap.containsKey(loser)){
                Pair p =new Pair();
                p.win = 0;
                p.loss =1 ;
                hmap.put(loser, p);
            }else{
                Pair p = hmap.get(loser);
                p.loss = p.loss+1;
                hmap.put(loser, p);
            }
            
        }
        
        ArrayList<Integer> winlist = new ArrayList<>();
         ArrayList<Integer> losslist = new ArrayList<>();
        for(Map.Entry<Integer, Pair> entry: hmap.entrySet()){
      //      System.out.println(entry.getKey() +" "+entry.getValue().win +" "+entry.getValue().loss);
          if(entry.getValue().loss==0){
              winlist.add(entry.getKey());
          }
            
          if(entry.getValue().loss==1){
              losslist.add(entry.getKey());
          }
        }
        
        List<List<Integer>>  res = new ArrayList<>();
        res.add(winlist);
        res.add(losslist);
        
        return res; 
        
        
    }
}