import java.io.*; 
import java.util.*; 
class Solution {
    public int firstMissingPositive(int[] nums) {
        
        
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        
        int arr[] = new int[set.size()]; 
        
        // toArray() method converts the set to array 
        //set.toArray(arr); 
        int i=0; 
        for(int n : set){
            arr[i] = n;
            i++;
        }
  
        
        Arrays.sort(arr);
        
       // System.out.println(Arrays.toString(arr));
        int index =0;
        
        while(index<arr.length && arr[index]<=0){
            index++;
        }
        
        if(index==arr.length){
            return 1;
        }
        
        int min = 1;
        
        while(index<arr.length && arr[index]==min){
        
           // System;out.println(index+" "+nums)
            min++;
            index++;
        }
        
        return min; 
        
        
    }
}