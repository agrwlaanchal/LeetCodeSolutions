class Solution {
    public int compareVersion(String version1, String version2) {
     
        
     String[] s1 = version1.split("\\.");
     String[] s2 = version2.split("\\.");
        
     ArrayList<Integer> arr1 = new ArrayList<>();
        for(String s: s1){
            arr1.add(Integer.valueOf(s));
        }
        
        
         ArrayList<Integer> arr2 = new ArrayList<>();
        for(String s: s2){
            arr2.add(Integer.valueOf(s));
        }
        
        
       while(arr1.size()<arr2.size()){
           arr1.add(0);
       }
        
        while(arr2.size()<arr1.size()){
            arr2.add(0);
        }
        
        
        for(int i=0; i<arr1.size();i++){
            if(arr1.get(i)<arr2.get(i)){
                return -1;
            }else if(arr1.get(i)>arr2.get(i)){
                return 1;
            }
        }
        
        return 0;
        
        
    }
}