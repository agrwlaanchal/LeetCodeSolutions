class Solution {
    public int countPalindromicSubsequence(String s) {
        // for a three length substring , we need to match first and last letter
        int res = 0;
        
        Set<Character> letters = new HashSet();
        for (Character c: s.toCharArray()) {
            letters.add(c);
        }
        
        HashSet<String> hset = new HashSet<>();
        for(Character letter : letters){
            
         
            //find first and last occurance
         
            int first = s.indexOf(letter);
            int last = s.lastIndexOf(letter);
            
            for(int j=first+1; j<last;j++){
                hset.add(""+letter+s.charAt(j)+letter);
            }
            
            
        }
    
    //System.out.println(hset);
        return hset.size();
}
}