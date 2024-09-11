class Solution {
    public int totalFruit(int[] fruits) {
     
        
        int start =0;
        
        
        HashMap<Integer , Integer> hmap =new HashMap<>();
        hmap.put(fruits[start],1);
        int res= 1; 
        for(int end=1; end<fruits.length;end++){
           
          //  System.out.println("for "+fruits[end]);
            
            if(hmap.containsKey(fruits[end])){
              //  System.out.println("hmap contains "+fruits[end]+" new value will be "+ (hmap.get(fruits[end])+1));
                hmap.put(fruits[end], hmap.get(fruits[end])+1); 
            //    System.out.println(hmap.get(fruits[end]));
            }else{
                
                if(hmap.size()>=2){
                 //    System.out.println("hmap size >=2 . ");
                    //we need to reduce count of start value
                    // before that get the current res 
                    int temp =0;
                    for(Map.Entry<Integer, Integer > entry: hmap.entrySet()){
                     //   System.out.println("current entry and value "+entry.getKey()+" "+entry.getValue());
                        temp=temp+entry.getValue();
                    }
                    
                    res= Math.max(res, temp);
                //    System.out.println("res is "+res);
                    
                    while(hmap.size()>=2){
                        int num = fruits[start];
                        int val = hmap.get(num);
                        if(val==1){
                            hmap.remove(num);
                        }else{
                            hmap.put(num, hmap.get(num)-1);
                        }
                        start++;
                    }
                    
                
                    hmap.put(fruits[end], 1);
                    
                }else{
                    hmap.put(fruits[end],1);
                }
                
            }
            
            
        }
        
         int temp =0;
                    for(Map.Entry<Integer, Integer > entry: hmap.entrySet()){
                        temp=temp+entry.getValue();
                    }
                    
                    res= Math.max(res, temp);
        
        return res;
    }
}