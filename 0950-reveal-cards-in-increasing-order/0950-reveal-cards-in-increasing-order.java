class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        
        
        Arrays.sort(deck);
        
        int[]res = new int[deck.length];
        
        Arrays.fill(res, -1);
        
        
        //boolean skip = false;
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<deck.length;i++){
            q.add(deck[i]);
        }
        
        int index=0;
        boolean skip = false;
        for(int i=0; i<deck.length;i++){
            
            int num = q.poll();
           // 
            
            
          //   System.out.println(Arrays.toString(res)+" "+index+" "+skip);
        
           boolean isplaced=false;
            while(!isplaced){
                
                if(index>=deck.length){
                index =0;
                } 
                 if(res[index]==-1){
                if(skip==false){
                res[index]=num;
                index++;
                    skip=true;
                    isplaced=true; 
                    break;
                }else{
                    skip=false;
                    index++;
                }
            }else{
                index++;
            }   
            }
            
            
           
                
            
            
           
            
            
        }
        
        return res;
        
    }
    
}