class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
     
         int count=0;
        for(String str: words){
            boolean flag = true;
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                if(allowed.indexOf(c)==-1){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
            
        }
        return count; 
        
        
    }
}