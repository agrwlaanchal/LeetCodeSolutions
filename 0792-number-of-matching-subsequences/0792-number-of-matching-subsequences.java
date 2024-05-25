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
       
        for (char c : s1.toCharArray()) { 
           
            index = s2.indexOf(c, index + 1); 
            if (index == -1) { 
                return 0;
            }
        }
        hset.add(s1);
        return 1;
       
    }
    
    
}