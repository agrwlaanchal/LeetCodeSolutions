class Solution {
    public String[] findRelativeRanks(int[] score) {
     
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
       
        for(int i=0;i<score.length;i++){
            pq.add(score[i]);
        }
        
        
        int index = score.length-1;
        
        while(!pq.isEmpty()){
            hmap.put(pq.poll(), index);
            index--;
        }
        
        String []res =new String[score.length];
        for(int i=0;i<res.length;i++){
            
            if(hmap.get(score[i])==0){
                res[i] = "Gold Medal";
            }else if(hmap.get(score[i])==1){
                res[i] = "Silver Medal";
            }else if(hmap.get(score[i])==2){
                res[i] = "Bronze Medal";
            }else{
                res[i] = ""+(hmap.get(score[i])+1);
            }
            
        }
        
        return res;
       
        
    }
    
}