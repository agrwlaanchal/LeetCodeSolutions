class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
     
        List<String> res = new ArrayList<>();
        String sb = "";
        int index =0 ;
        Set<String> wordSet = new HashSet<>(wordDict);
        
         calculate(s, res,sb, wordSet, index);
        return res; 
        
    }
    
    public void calculate(String s, List<String> res,String currentSentence,Set<String> wordSet, int index  ){
        
        
        if (index == s.length()) {  // Reached the end of the string
    res.add(currentSentence);  // Add the constructed sentence
    return;
  }
        
        
        for (int end = index + 1; end <= s.length(); end++) {
    String word = s.substring(index, end);
    if (wordSet.contains(word)) {
      String newSentence = currentSentence.isEmpty() ? word : currentSentence + " " + word;
      calculate(s, res, newSentence, wordSet, end);  // Explore possibilities with the current word
    }
  }
        
        
        
    }
    
}