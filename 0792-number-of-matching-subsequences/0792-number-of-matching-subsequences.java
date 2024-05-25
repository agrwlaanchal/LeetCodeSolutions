class Solution {
     HashSet<String> hset = new HashSet<>();
    public int numMatchingSubseq(String s, String[] words) {
        
        int count =0; 
       
        for(String word: words){
            if(hset.contains(word)){
                count++;
            }else{
           count=count+ checkSub(word, s);
            }
        }
        return count; 
        
    }
    
    public int checkSub(String s1, String s2){
       
        int index = -1; 
       
      // Loop through each character in s1
        for (char c : s1.toCharArray()) { 
           
          // Find the index of the current character in s2
            index = s2.indexOf(c, index + 1); 
          // If the character is not found, return false
            if (index == -1) { 
                return 0;
            }
        }
        return 1;
       
    }
    
    
}