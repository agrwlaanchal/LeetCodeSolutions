class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        
        
        List<Integer> res = new ArrayList<>();
        if(s.length()<p.length())
        {
            return res; 
        }
        
        
        int[]parr = new int[26];
       Arrays.fill(parr, 0);
        for(int i=0;i<p.length();i++){
            char c = p.charAt(i);
            parr[c-'a']++;
        }
        
        int start =0;
        int end= p.length()-1;
        p = p+p;
        while(end<s.length()){
            //String temp = s.substring(start, end+1);
            
            int[]temparr = new int[26];
            Arrays.fill(temparr, 0);
  
            for(int i=start;i<=end;i++){
                char ch = s.charAt(i);
                temparr[ch-'a']++;
            }
            
            if(Arrays.equals(temparr, parr)){
                res.add(start);
            }
            
            start++;
            end++;
        }
        return res; 
        
    }
}