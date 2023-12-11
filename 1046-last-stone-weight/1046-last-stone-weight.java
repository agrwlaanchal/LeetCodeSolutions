import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
 
     
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<stones.length;i++)
            arr.add(stones[i]);
        
        
        while(arr.size()>1){
            
            Collections.sort(arr);
           // System.out.println("arr size "+arr.size());
            int a = arr.remove(arr.size()-1);
            int b =  arr.remove(arr.size()-1);
            //System.out.println(a+" "+b);
            if(a!=b){
                arr.add(a-b);
            }
         //   System.out.println(arr.toString());
        }
        
        if(arr.size()==1){
            return arr.get(0);
        }
        else
            return 0;
        
    }
}