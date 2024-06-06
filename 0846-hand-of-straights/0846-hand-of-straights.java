class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        if(hand.length%groupSize!=0){
            return false;
        }
        
        
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        for(int num: hand){
            tmap.put(num, tmap.getOrDefault(num,0)+1);
        }
        
        
        //no of rotation arr/gz 
        int rotations = hand.length/groupSize;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<rotations; i++){
            
            for(int num: arr){
                tmap.remove(num);
            }
            arr.clear();
            int count =0;
            int prev= -1;
            if(tmap.size()<groupSize){
                return false;
            }
           
            for(Map.Entry<Integer, Integer> entry: tmap.entrySet()){
              //  System.out.println("getting value "+entry.getKey());
                
                if(count<groupSize){
                   
                    if(count==0){
                //         System.out.println("going here ");
                        prev = entry.getKey();
                    }else{
                  //      System.out.println("going inside else ");
                    if(prev+1!=entry.getKey()){
                        return false;
                    }
                    prev = entry.getKey();
                }
                    
                
                count++;
                
                tmap.put(entry.getKey(), tmap.get(entry.getKey())-1);
                if(tmap.get(entry.getKey())==0){
                   arr.add(entry.getKey());
                }
                    
                 //System.out.println("-------");
                }
                
                
                
            }
            
        }
        return true; 
        
        
        
    }
}