class Solution {
    public int numberOfSpecialChars(String word) {
    
        boolean []res = new boolean[26];
        boolean []visited = new boolean[26];
        
        for(int i=0;i<word.length();i++){
            
            char c = word.charAt(i);
            
            if(Character.isLowerCase(c) && !visited[c-97]){
                
                int index = word.indexOf((char)(c-32));
                int index2 = word.lastIndexOf(c);
               // System.out.println(c+" "+index+" "+index2);
                if(index!=-1 && index>index2 ){
                    res[c-97]=true;
                    
                }
                visited[c-97]=true;
                
            }
            
            
        }
        int count=0;
        for(int i=0;i<res.length; i++){
            if(res[i]==true){
                count++;
            }
        }
        
        return count; 
        
    }
}