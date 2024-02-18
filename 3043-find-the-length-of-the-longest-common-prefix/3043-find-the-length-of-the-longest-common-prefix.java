class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

         HashSet<Integer> hset = new HashSet<>();
    for(int i=0; i<arr1.length; i++){
        
        //put all prefixes of arr1[i] into hashset
       
        String temp="";
        String word = String.valueOf(arr1[i]);
        for(int j=0;j<word.length();j++){
            int val = Integer.parseInt(word.substring(0, j+1));
            hset.add(val);
        }
    }
        
        int res =0; 
        for(int i=0;i<arr2.length;i++){
            String word2 = String.valueOf(arr2[i]);
            for(int j=res;j<word2.length();j++){
                int val = Integer.parseInt(word2.substring(0, j+1));
                if(hset.contains(val)){
                   res=j+1;
                }
            
            }
        }
        
   
        return res; 
    
    }
}



