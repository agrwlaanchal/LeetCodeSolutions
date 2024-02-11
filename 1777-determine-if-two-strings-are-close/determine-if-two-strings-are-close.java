class Solution {
    public boolean closeStrings(String word1, String word2) {


         HashMap<Character, Integer> hmap1 = new HashMap<>(); 
         HashMap<Character, Integer> hmap2 = new HashMap<>(); 

         for(int i=0; i<word1.length();i++){
             char c = word1.charAt(i);
             if(hmap1.containsKey(c)){
                 hmap1.put(c, hmap1.get(c)+1);
             }else{
                 hmap1.put(c,1);
             }
         }
         

         for(int i=0; i<word2.length();i++){
             char c = word2.charAt(i);
             if(hmap2.containsKey(c)){
                 hmap2.put(c, hmap2.get(c)+1);
             }else{
                 hmap2.put(c,1);
             }
         }

        if(hmap1.equals(hmap2))
        return true;

        if(! hmap1.keySet().equals(hmap2.keySet()))
        return false; 
            ArrayList<Integer> set1 = new ArrayList<>(hmap1.values()); 
            Collections.sort(set1);
        // Value set of map2 
        ArrayList<Integer> set2 = new ArrayList<>(hmap2.values()); 
       Collections.sort(set2);
       return set1.equals(set2);

    }
}