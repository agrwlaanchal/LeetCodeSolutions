class Solution {
    public int search(int[] arr, int target) {
     
        /*
        
    Find middle-point mid = (l + h)/2 
    If the key is present at the middle point, return mid.
    Else if the value at l is less than the one at mid then arr[l . . . mid] is sorted
        If the key to be searched lies in the range from arr[l] to arr[mid], recur for arr[l . . . mid].
        Else recur for arr[mid+1 . . . h]  
    Else arr[mid+1. . . h] is sorted: 
        If the key to be searched lies in the range from arr[mid+1] to arr[h], recur for arr[mid+1. . . h].
        Else recur for arr[l. . . mid] 

        */
        
        int start= 0;
        int end = arr.length-1;
        
        while(start<=end){
            
            int mid=start+(end-start)/2;
            
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>=arr[start]){
                //left sorted
               
                if(arr[start]<=target && arr[mid]>=target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
                
            }else{
                if(arr[mid]<=target && target <= arr[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
                
            }
            
            
        }
        return -1;
        
    }
}