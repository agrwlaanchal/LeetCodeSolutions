class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
     
        TreeMap<Integer, String> hmap= new TreeMap<>();
        for(int i=0; i<heights.length;i++){
            
            hmap.put(heights[i], names[i]);
            
        }
        
       String[] res = new String[names.length];
        int index = res.length-1;
        for(Map.Entry<Integer, String> entry: hmap.entrySet()){
            res[index] = entry.getValue();
            index--;
        }
        return res;
        
    }
}