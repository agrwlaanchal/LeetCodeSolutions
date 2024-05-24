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
          //  System.out.println(start+" "+end);
            String temp = s.substring(start, end+1);
            //System.out.println(temp+" "+p);
            
            int[]temparr = new int[26];
            Arrays.fill(temparr, 0);
  
            for(int i=0;i<temp.length();i++){
                char ch = temp.charAt(i);
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