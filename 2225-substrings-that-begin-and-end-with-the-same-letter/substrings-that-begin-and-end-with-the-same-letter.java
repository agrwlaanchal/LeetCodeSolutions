class Solution {
    public long numberOfSubstrings(String s) {
       HashMap<Character, Long> hmap = new HashMap<>();

       long res =0;

       for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(hmap.containsKey(c)){
            res=res+hmap.get(c);
        }
        hmap.put(c, hmap.getOrDefault(c,0L)+1);
       } 

        for(Map.Entry<Character, Long> entry: hmap.entrySet()){
            res=res+entry.getValue();
        }

        return res;
    }
}