class Solution {
    public int lengthOfLongestSubstring(String s) {


        if(s.length()==0)
        return 0; 

       int left=0;
       


       HashMap<Character,Integer> hmap = new HashMap<>();
       hmap.put(s.charAt(0), 0);
       int len =1; 
      
      for(int right=1; right<s.length();right++){
       //   System.out.println("char "+s.charAt(right));
          if(hmap.containsKey(s.charAt(right))){
            //repeated char 
              int temp = hmap.get(s.charAt(right))+1;
              if(temp>left){
                left=temp;
              }
             
          }
            hmap.put(s.charAt(right), right);
            len=Math.max(len,right-left+1);
            //System.out.println("len is "+len);
          
      }
      return len;
        
    }
}