class Solution {
    public String mergeAlternately(String word1, String word2) {
     
        int s1=0;
        int s2=0;
        String res="";
        while(s1<word1.length() && s2<word2.length()){
            res=res+word1.charAt(s1)+word2.charAt(s2);
            s1++;
            s2++;
        }
        
        while(s1<word1.length()){
            res=res+word1.charAt(s1);
            s1++;
        }
        
        while(s2<word2.length()){
            res=res+word2.charAt(s2);
            s2++;
        }
        return res; 
        
    }
}