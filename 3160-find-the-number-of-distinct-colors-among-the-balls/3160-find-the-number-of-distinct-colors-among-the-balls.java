class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        
        HashMap<Integer, Integer> ballColors = new HashMap<>();
        
        HashMap<Integer, Integer> hmap = new HashMap<>(); //this is hashmap of color and count 
        int[]res = new int[queries.length];
       
       // hmap.put(queries[0][1], 1);
         
       // res[0]=hmap.size();
        //ballColors.put(queries[0][0],queries[0][1] );
       
        for(int i=0;i<queries.length;i++){
            
            int ball = queries[i][0];
            int color = queries[i][1];
        
            int prevcolor = ballColors.getOrDefault(ball, 0);
            
            if(prevcolor!=0){
                hmap.put(prevcolor, hmap.get(prevcolor)-1);
                if(hmap.get(prevcolor)==0){
                    hmap.remove(prevcolor);
                }
            }
            
               ballColors.put(ball, color);
                hmap.put(color, hmap.getOrDefault(color,0)+1);
                res[i]=hmap.size();
            
        }
        
        return res; 
    }
    
    
    
    
    
}