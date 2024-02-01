class Solution {
    public String reverseVowels(String s) {
     
       //find all the vowels first
        
        String temp = "";
        
        
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u' || 
              c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                temp=temp+c;
            }
        }
        
        int index = temp.length()-1;
        String res="";
          for(int i=0;i<s.length();i++){
              
          
              char c = s.charAt(i);
              if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u' || 
              c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
               // temp=temp+c;
                 res=res+temp.charAt(index);
                  index--;
               }else{
                  res=res+c;
              }
          
          }
        return res; 
        
    }
}