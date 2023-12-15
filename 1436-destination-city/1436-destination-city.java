class Solution {
    public String destCity(List<List<String>> paths) {
     
     
        HashMap<Object, ArrayList<Object>> hmap = new HashMap<>();
        
        
        for(List l: paths){
            
            
            if(hmap.containsKey(l.get(0))){
                ArrayList<Object>temp = hmap.get(l.get(0));
                temp.add(l.get(1));
                hmap.put(l.get(0), temp);
            }else{
                ArrayList<Object>temp = new ArrayList<>();
                temp.add(l.get(1));
                hmap.put(l.get(0), temp);
            }
            
            
            if(!hmap.containsKey(l.get(1))){
                 ArrayList<Object>temp = new ArrayList<>();
                 hmap.put(l.get(1), temp);
            }
            
        }
        
        
        for(Map.Entry<Object, ArrayList<Object>> entry : hmap.entrySet()){
            if(entry.getValue().size()==0){
                return (String)entry.getKey();
            }
        }
        
        return null;
        
    }
}