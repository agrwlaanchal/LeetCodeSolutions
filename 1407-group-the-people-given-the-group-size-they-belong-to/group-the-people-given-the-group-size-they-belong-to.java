class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {

      HashMap<Integer,List<Integer>> hmap = new HashMap<>();

        for(int i=0 ;i<groupSizes.length;i++){

            if(hmap.containsKey(groupSizes[i])){
                List<Integer> temp = hmap.get(groupSizes[i]);
                temp.add(i);
                hmap.put(groupSizes[i], temp);
            }else{
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                hmap.put(groupSizes[i], temp);
            }
        }

 


    List<List<Integer>> res=new ArrayList<>();
        for(Map.Entry<Integer, List<Integer>> entry : hmap.entrySet()){

            int gsize = entry.getKey();
            List<Integer> temp = entry.getValue();
             
             
             int i=0;
             while(i<temp.size()){
                    List<Integer> r = new ArrayList<>();
                 for(int j=0;j<gsize; j++){
                     if(i<temp.size()){
                        r.add(temp.get(i));
                        i++;
                     }
                 }
                 res.add(r); 

             }
           

        }
        return res; 
    }
}