class Solution {
    public String longestCommonPrefix(String[] strs) {
        
    
        String res="";
        
       // Arrays.sort(strs);
        
        String temp=strs[0];
        
      outer:   while(temp.length()>0){
             
             
             for(int i=1; i<strs.length;i++){
                 if(!strs[i].startsWith(temp)){
                     temp=temp.substring(0, temp.length()-1);
                     System.out.println(temp);
                     continue outer;
                 }
             }
             return temp;
         }
        
        return "";
    
    
    }
}