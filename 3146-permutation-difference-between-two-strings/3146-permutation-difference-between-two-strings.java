class Solution {
    public int findPermutationDifference(String s, String t) {
      int res =0; 
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int index = t.indexOf(c);
            res=res+Math.abs(index-i);
        }
        return res; 
        
    }
}