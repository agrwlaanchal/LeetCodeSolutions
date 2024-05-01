class Solution {
    public String reversePrefix(String word, char ch) {
        
        int index = word.indexOf(ch);
        if(index==-1){
            return word;
        }else if(index==word.length()-1){
            StringBuilder s = new StringBuilder(word);
            return s.reverse().toString();
        }else{
            StringBuilder s = new StringBuilder(word.substring(0, index+1)).reverse();
            return s.toString()+word.substring(index+1);
        }
        
        
    }
}