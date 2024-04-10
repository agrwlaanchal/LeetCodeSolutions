class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {

     int index =0;

     HashMap<Character, Integer> hmap = new HashMap<>();
        int res =0 ;

     for(int i=0; i<s.length();i++){
        char c=s.charAt(i);

        if(hmap.containsKey(c)){
            hmap.put(c, hmap.get(c)+1);
        }else{
            hmap.put(c,1);
        }

        if(hmap.size()>2){
            while(index<s.length()&&!hmap.containsKey(s.charAt(index))){
                index++;
            }
            
                hmap.put(s.charAt(index), hmap.get(s.charAt(index))-1);
                if(hmap.get(s.charAt(index))==0){
                    hmap.remove(s.charAt(index));
                }

                index++;
            
            
        }

        res=Math.max(res, i-index);



     }
     return res+1; 

    }
}