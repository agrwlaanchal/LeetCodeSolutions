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
        //p = p+p;
        
         int[]temparr = new int[26];
         Arrays.fill(temparr, 0);
  
        for(int i=start;i<=end;i++){
                char ch = s.charAt(i);
                temparr[ch-'a']++;
        }
            
        if(Arrays.equals(temparr, parr)){
                res.add(start);
        }
        
        while(end<s.length()){
            
            int prevstart = start;
            
            start++;
            end++;
            if(end<s.length()){
                temparr[s.charAt(prevstart)-'a']--;
                temparr[s.charAt(end)-'a']++;
                 if(Arrays.equals(temparr, parr)){
                res.add(start);
        }
            }
            
            
        }
        
       
        return res; 
        
    }
}