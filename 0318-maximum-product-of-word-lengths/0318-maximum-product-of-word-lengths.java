class Solution {
    public int maxProduct(String[] words) {
        
        int max = 0;
        Arrays.sort(words);
        for(int i=words.length-1; i>=0;i--){
            
            String word = words[i];
            for(int j=i-1; j>=0;j--){
                
                if( max<(word.length() * words[j].length()) &&  !common(word, words[j])){
                   // System.out.println(word+" "+words[j]);
                  max=Math.max(word.length() * words[j].length(),max);  
                }
                
            }
            
        }
        
        return max;
    }
    
    private boolean common(String a, String b){
        
        if(a.length()<b.length()){
            
            for(int i=0;i<a.length();i++){
                char c = a.charAt(i);
                if(b.indexOf(c)!=-1){
                    return true;
                }
            }
            return false;
            
        }else{
            for(int i=0;i<b.length();i++){
                char c = b.charAt(i);
                if(a.indexOf(c)!=-1){
                    return true;
                }
            }
            return false;
            
            
        }
        
        
    }
    
    
}