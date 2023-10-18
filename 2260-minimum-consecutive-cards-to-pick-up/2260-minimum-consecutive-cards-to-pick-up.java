class Solution {
    public int minimumCardPickup(int[] cards) {
     
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int res = -1;
        for(int i=0;i<cards.length ;i++){
            
            
            if(hmap.containsKey(cards[i])){
                int val = hmap.get(cards[i]);
                int count = i-val+1;
                if(res==-1){
                    res = count;
                }else{
                    res = Math.min(res, count);
                }
              
            }
              hmap.put(cards[i], i);
            
        }
        return res;
    }
}