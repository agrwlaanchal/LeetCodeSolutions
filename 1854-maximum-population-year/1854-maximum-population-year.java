class Solution {
    public int maximumPopulation(int[][] logs) {
     
        TreeMap<Integer, Integer> hmap = new TreeMap<>();
        
        for(int i=0;i<logs.length;i++){
            
            int birthyear = logs[i][0];
            int deathyear = logs[i][1]-1;
            for(int j=birthyear; j<=deathyear; j++){
                
                hmap.put(j, hmap.getOrDefault(j,0)+1);
                
            }
            
        }
        
        
        int max =0;
        int year  =logs[0][0];
        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
            
           // System.out.println(entry.getKey()+" "+entry.getValue());
            if(entry.getValue()>max){
                max=entry.getValue();
                year= entry.getKey();
            }
            
            
        }
        return year; 
        
        
    }
}