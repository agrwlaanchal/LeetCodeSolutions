class Pair  {
    
    
    int row;
    int value;
    
    Pair(int r, int v ){
        this.row = r;
        this.value = v;
    }
    
   /* public int compareTo(Pair p){
        return p.row - this.row; 
    }*/
    
}

class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        
   
        // map of sum of (i, j) and pair 
        // pair to be inserted with highest row value first 
        
    TreeMap<Integer, ArrayList<Pair>> hmap = new TreeMap<>();
        
        for(int i=0;i<nums.size(); i++){
            for(int j=0 ; j<nums.get(i).size() ;j++){
                int sum = i+j;
                
             //   System.out.println("sum is "+sum);
                if(hmap.containsKey(sum)){
                    ArrayList<Pair> arr = hmap.get(sum);
                     
                    Pair p =new Pair(i, nums.get(i).get(j));
                    arr.add(p);
                    hmap.put(sum, arr);
                }else{
                 ArrayList<Pair> arr =  new ArrayList<>();
                     Pair p =new Pair(i, nums.get(i).get(j));
                    arr.add(p);
                    hmap.put(sum, arr);
                }
                
                
            }
            
        }
        
      
        
        ArrayList<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, ArrayList<Pair>> entry: hmap.entrySet()){
            //System.out.println(entry.getKey());
         //   System.out.println(entry.getValue().size());
            
            ArrayList<Pair> temp = entry.getValue();
            for(int i=temp.size()-1; i>=0; i--){
                res.add(temp.get(i).value);
            }
        }
        
       
     int[]result = new int[res.size()];
        int i=0;
        for(int num: res){
            result[i]=num;
            i++;
        }
        
        return result;
    
}
}