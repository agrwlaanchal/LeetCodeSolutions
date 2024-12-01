class Solution {
    public boolean checkIfExist(int[] arr) {
     
        HashSet<Integer> hset = new HashSet<>();
       
        
        for(int i=0;i<arr.length;i++){
            
            int num = (arr[i]*2);
            if(hset.contains(num) || (arr[i]%2==0 && hset.contains(arr[i]/2) ) ){
                return true;
            }
            hset.add(arr[i]);
            
        }
        
        return false;
        
    }
}