class Solution {
    public int getWinner(int[] arr, int k) {
      
        
        if(k>=arr.length){
            Arrays.sort(arr);
            return arr[arr.length-1];
        }
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        Queue <Integer> q = new LinkedList<>();
        ArrayList<Integer> li = new ArrayList<>();
        for(Integer num:arr){
            li.add(num);
        }
        
        
        int count=0;
        
        while(count<k){
            int max = 0;
            if(li.get(0)>li.get(1)){
                max=li.get(0);
                int temp = li.get(1);
                li.remove(1);
                li.add(temp);
            }else{
                max=li.get(1);
                int index0 = li.get(0);
                int index1 = li.get(1);
                li.remove(0);
                li.add(index0);
            }
            
            if(hmap.containsKey(max)){
                hmap.put(max, hmap.get(max)+1);
            }else{
                hmap.put(max,1);
            }
            if(hmap.get(max)==k)
                return max;
        }
        return 0;
        
    }
}